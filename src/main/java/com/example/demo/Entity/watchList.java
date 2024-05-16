package com.example.demo.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class watchList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String movieTitle;
    private String movieGenre;
    private String releaseDate;


    public String getMovieTitle(){
        return  movieTitle;
    }

    public String getMovieGenre(){
        return movieGenre;
    }

    public String getReleaseYear(){
        return releaseDate;
    }

}
