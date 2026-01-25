package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Sales;

class ProductSales {
    int productId;
    double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }
    public double getTotalRevenue() {
        return totalRevenue;
    }
    @Override
    public String toString() {
        return "ProductSales" +
                "{" +
                "id=" + productId +
                ", revenue=" +
                totalRevenue +
                "}";
    }
}

