package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Books;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public void getRecommendations(List<Book> books) {

        List<BookRecommendation> recommendations =
                books.stream()
                .filter(b -> "Science Fiction".equals(b.getGenre()) && b.getRating() > 4.0)
                .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                .sorted(Comparator.comparingDouble((BookRecommendation r) -> r.rating).reversed())
                .collect(Collectors.toList());


        List<BookRecommendation> page1 = recommendations.stream().limit(5).collect(Collectors.toList());
        System.out.println("Page 1: " + page1);
    }



    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune", "Herbert", "Science Fiction", 4.8));

        new Main().getRecommendations(books);
    }
}

