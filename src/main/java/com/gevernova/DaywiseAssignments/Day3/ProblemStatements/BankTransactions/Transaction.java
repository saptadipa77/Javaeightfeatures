package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.BankTransactions;

class Transaction {

    int transactionId;
    String policyNumber;
    double amount;
    boolean isFraudulent;


    public Transaction(int id, String policy, double amount, boolean fraud) {
        this.transactionId = id;
        this.policyNumber = policy;
        this.amount = amount;
        this.isFraudulent = fraud;
    }
}

