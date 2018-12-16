package com.week3.exercise3;

public class Book extends Product {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }
}
