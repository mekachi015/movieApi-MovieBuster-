package com.example.demo.Service;

import com.example.demo.Entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    void saveMovie(Movie movie);
    Movie getMovieById(Long id);
    void updateMovie(Long id);

    void updateMovie(Long id, Movie movie);

    void deleteMovie(Long id);
}
