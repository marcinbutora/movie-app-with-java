package com.vattenfall.movieapp.movie.category;

public enum Category {
    DRAMA("Drama"), ROMANCE("Romance"), COMEDY("Comedy");

    private String value;

    Category(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Category{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
