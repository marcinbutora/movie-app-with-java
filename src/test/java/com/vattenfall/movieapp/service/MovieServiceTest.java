package com.vattenfall.movieapp.service;

import com.vattenfall.movieapp.movie.category.Category;
import com.vattenfall.movieapp.movie.model.Movie;
import com.vattenfall.movieapp.movie.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class MovieServiceTest {
    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieRepository movieRepository;

    @Test
    void shouldSaveNewMovie() {
        // given
        Movie movie = new Movie(1L, "Titanic", 1997, Category.ROMANCE);
        // when
        Movie savedMovie = movieService.createMovie(movie);
        // then
        assertThat(savedMovie).isEqualTo(movie);
    }

}