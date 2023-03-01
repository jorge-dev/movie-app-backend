package com.jorgedev.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }



    public List<Movie> allMovie(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
