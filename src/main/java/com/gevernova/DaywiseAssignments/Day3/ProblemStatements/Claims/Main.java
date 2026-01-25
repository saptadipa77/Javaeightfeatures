package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Claims;

import java.util.*;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;



public class Main {
    public void analyzeClaims(List<Claim> claims) {

        List<Claim> filteredClaims =
                claims.stream()
                .filter(c -> "Approved".equals(c.getStatus()) && c.getClaimAmount() > 5000)
                .collect(Collectors.toList());


        Map<String, DoubleSummaryStatistics> statsByPolicy =
                filteredClaims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getPolicyNumber,
                        Collectors.summarizingDouble(Claim::getClaimAmount)
                ));


        List<String> top3Policies = statsByPolicy.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue().getSum(), e1.getValue().getSum()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.out.println("Top 3 Policies: " + top3Policies);
        statsByPolicy.forEach((policy, stats) -> {
            System.out.println("Policy: " + policy + " | Total: " + stats.getSum() + " | Avg: " + stats.getAverage());
        });
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim(1, "POL001", 6000, "Approved"),
                new Claim(2, "POL001", 7000, "Approved"),
                new Claim(3, "POL002", 15000, "Approved"),
                new Claim(4, "POL003", 2000, "Approved"),
                new Claim(5, "POL004", 12000, "Approved")
        );
        new Main().analyzeClaims(claims);
    }
}
