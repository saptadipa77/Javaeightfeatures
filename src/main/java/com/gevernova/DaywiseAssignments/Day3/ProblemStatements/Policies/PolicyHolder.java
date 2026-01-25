package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Policies;

class PolicyHolder {

int holderId;
String name, policyType;
int age;
double premiumAmount;

public PolicyHolder(int id, String name, int age, String type, double premium) {
    this.holderId = id;
    this.name = name;
    this.age = age;
    this.policyType = type;
    this.premiumAmount = premium;
}
public String getPolicyType() {
    return policyType;
}
public int getAge() {
    return age;
}
public double getPremiumAmount() {
    return premiumAmount;
}
}

