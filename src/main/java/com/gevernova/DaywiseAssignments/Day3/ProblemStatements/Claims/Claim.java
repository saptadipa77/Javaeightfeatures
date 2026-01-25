package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Claims;

class Claim {
    private int claimId;
    private String policyNumber;
    private double claimAmount;
    private String status;

    public Claim(int claimId, String policyNumber, double claimAmount, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public double getClaimAmount()
    { return claimAmount;
    }
    public String getPolicyNumber()
    {
        return policyNumber;
    }
}

