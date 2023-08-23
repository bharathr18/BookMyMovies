package com.practice.backend.BookMyMovies.Service;

import com.practice.backend.BookMyMovies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String createMovie()
}
