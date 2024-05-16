package com.example.demo.Service;

import com.example.demo.Entity.Movie;
import com.example.demo.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovieServiceImplementation implements MovieService{

    @Autowired
    private MovieRepository movieRepo;

    @Override
    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }

    @Override
    public void saveMovie(Movie movie){
        movieRepo.save(movie);
    }


    @Override
    public Movie getMovieById(Long id) {
        Optional<Movie> optional = movieRepo.findById(id);
        Movie movie;
        if (optional.isPresent()) {
            movie = optional.get();
        } else {
            throw new RuntimeException("Movie for the id " + id + " is not found");
        }
        return movie;
    }

    @Override
    public void updateMovie(Long id) {

    }

    @Override
    public void updateMovie(Long id, Movie movie) {

    }

//    @Override
//    public void updateMovie(Long id) {
//
//    }

//    @Override
//    public void updateMovie(Long id, Movie movie) {
//        Optional<Movie> optional = movieRepo.findById(id);
////        if (optional.isPresent()) {
////            Movie movieFromDb = optional.get();
////            movieFromDb.setTitle(movie.getTitle());
////            movieFromDb.setGenre(movie.getGenre());
////            movieFromDb.setDirector(movie.getDirector());
////            movieFromDb.setReleaseYear(movie.getReleaseYear());
////            movieRepo.save(movieFromDb); // Save the updated movie back to the database
////        } else {
////            throw new RuntimeException("Movie for the id " + id + " is not found");
////        }
//    }

    @Override
    public void deleteMovie(Long id) {
        movieRepo.deleteById(id); // Use JpaRepository's deleteById method to delete the movie
    }
}


