package com.example.demo.Controller;


import com.example.demo.Entity.Movie;
import com.example.demo.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> findAll(){
        return movieService.getAllMovies();
    }

    @PostMapping
    public void save (@RequestBody Movie movie){
        movieService.saveMovie(movie);
    }

    @GetMapping("/{id}")
    public Movie findOne(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PutMapping
    public void update(@PathVariable Long id, @RequestBody Movie movie) {
        this.movieService.updateMovie(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.movieService.deleteMovie(id);
    }
}
