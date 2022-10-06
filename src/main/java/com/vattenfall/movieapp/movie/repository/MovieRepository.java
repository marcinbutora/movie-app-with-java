package com.vattenfall.movieapp.movie.repository;

import com.vattenfall.movieapp.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findMovieByTitle(String title);
    Optional<Movie> findMovieByMovieId(Long movieId);
    Movie deleteMovieByMovieId(Long movieId);
}
