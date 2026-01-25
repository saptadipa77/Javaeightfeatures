package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.BankTransactions;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public void detectFraud(List<Transaction> transactions) {

        Map<String, DoubleSummaryStatistics> fraudStats =
                transactions.stream()
                .filter(t -> t.isFraudulent && t.amount > 10000)
                .collect(
                        Collectors.groupingBy(t -> t.policyNumber,
                                Collectors.summarizingDouble(t -> t.amount))); // 3. Aggregate

        System.out.println(fraudStats);

        fraudStats.forEach((policy, stats) -> {
            if (stats.getCount() > 5 || stats.getSum() > 50000) {
                System.out.println("ALERT: Policy " + policy + " flagged for high fraud activity!");
            }
        });

    }

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(new Transaction(1, "POL123", 15000, true));
        new Main().detectFraud(transactions);
    }
}

