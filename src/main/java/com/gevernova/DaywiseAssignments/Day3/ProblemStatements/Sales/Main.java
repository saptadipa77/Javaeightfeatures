package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Sales;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public void analyzeSales(List<Sale> sales) {


        List<ProductSales> top5Products =
                sales.stream()
                .filter(s -> s.getQuantity() > 10) // 1. Filter
                .map(s -> new ProductSales(s.getProductId(), s.getQuantity() * s.getPrice())) // 2. Transform
                .sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed()) // 3. Sort
                .limit(5) // 4. Top N
                .collect(Collectors.toList());

        top5Products.forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale(101, 15, 10.0),
                new Sale(102, 5, 20.0),
                new Sale(103, 20, 5.0));


        new Main().analyzeSales(sales);
    }
}

