package com.omdb;

import org.junit.Test;

public class Movies
{
    FindMovie findMovie = new FindMovie();

    String apiKey = System.getProperty("apiKey","a50f0de6");
    String searchWord = System.getProperty("searchWord","Harry Potter");
    String movieTitle = System.getProperty("movieTitle","Harry Potter and the Sorcerer's Stone");

    @Test
    public void harryPotterSearchAssertion(){

        String id = findMovie.getIdFromMovie(apiKey, searchWord, movieTitle);
        findMovie.searchByID(apiKey, id);
    }


}

