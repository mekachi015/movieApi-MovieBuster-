package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String movieTitle;
    private String movieGenre;
    private int relYear; // relYear stands for year of release

    public Movie (){} //constructor

    public Movie (String movieTitle, String movieGenre, int relYear){
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.relYear = relYear;
    }


    public Long getId(){
        return id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public int getReleaseYear() {
        return relYear;
    }
}
