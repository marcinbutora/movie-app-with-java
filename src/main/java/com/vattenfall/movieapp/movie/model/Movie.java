package com.vattenfall.movieapp.movie.model;

import com.vattenfall.movieapp.movie.category.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;
    private String title;
    private int movieYear;
    private Category category;

    public Movie(Long movieId, String title, int movieYear, Category category) {
        this.movieId = movieId;
        this.title = title;
        this.movieYear = movieYear;
        this.category = category;
    }

    public Movie() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieYear == movie.movieYear && Objects.equals(movieId, movie.movieId) && Objects.equals(title, movie.title) && Objects.equals(category, movie.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, title, movieYear, category);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", movieYear=" + movieYear +
                ", category=" + category +
                '}';
    }
}
