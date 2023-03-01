package com.jorgedev.movie.services;

import com.jorgedev.movie.Movie;
import com.jorgedev.movie.repositories.MovieRepository;
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
