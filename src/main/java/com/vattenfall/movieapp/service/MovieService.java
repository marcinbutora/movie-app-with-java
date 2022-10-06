package com.vattenfall.movieapp.movie.service;

import com.vattenfall.movieapp.movie.model.Movie;
import com.vattenfall.movieapp.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    Optional<Movie> findMovieByTitle(String title) throws Exception {
        return findMovieByMovieTitle(title);
    }

    Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    private Optional<Movie> findMovieByMovieTitle(String title) throws Exception {
        Optional<Movie> movieByTitle = movieRepository.findMovieByTitle(title);
        if (movieByTitle.isEmpty()) {
            throw new Exception("Movie not found");
        }
        return movieByTitle;
    }
}
