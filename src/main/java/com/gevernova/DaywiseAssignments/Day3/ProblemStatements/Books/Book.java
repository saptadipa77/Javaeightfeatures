package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.Books;

class Book {
    String title, author, genre;
    double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }
    public String getGenre() {
        return genre;
    }
    public double getRating() {
        return rating;
    }
    public String getTitle() {
        return title;
    }
}

