package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Books;

class BookRecommendation {
    String title;
    double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return title + " (" + rating + ")"; }
}

