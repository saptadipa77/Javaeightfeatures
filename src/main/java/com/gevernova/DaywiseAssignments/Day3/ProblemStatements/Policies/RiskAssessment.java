package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Policies;

class RiskAssessment {

    int holderId;
    String name;
    double riskScore;

    public RiskAssessment(int id, String name, double score) {
        this.holderId = id;
        this.name = name;
        this.riskScore = score;
    }
    @Override
    public String toString() {
        return name + ": " + riskScore;
    }
}

