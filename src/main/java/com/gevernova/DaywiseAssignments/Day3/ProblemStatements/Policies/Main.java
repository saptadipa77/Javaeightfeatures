package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Policies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public void assessRisk(List<PolicyHolder> holders) {

        List<RiskAssessment> assessments = holders.stream()
                .filter(p -> "Life".equals(p.getPolicyType()) && p.getAge() > 60) // 1. Filter
                .map(p -> new RiskAssessment(p.holderId, p.name, p.getPremiumAmount() / p.getAge())) // 2. Transform
                .sorted(Comparator.comparingDouble((RiskAssessment r) -> r.riskScore).reversed()) // 3. Sort
                .collect(Collectors.toList());


        Map<String, List<RiskAssessment>> categorized =
                assessments.stream()
                .collect
                        (Collectors.
                                groupingBy(r -> r.riskScore > 0.5 ? "High Risk" :
                                        "Low Risk"));

        System.out.println(categorized);
    }

    public static void main(String[] args) {
        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder(1,
                        "John",
                        65,
                        "Life", 5000));

        new Main().assessRisk(holders);
    }
}
