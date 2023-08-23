package com.practice.backend.BookMyMovies.Service;

import com.practice.backend.BookMyMovies.Dtos.MovieRequestDto;
import com.practice.backend.BookMyMovies.Models.MovieEntity;
import com.practice.backend.BookMyMovies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String createMovie(MovieRequestDto movieRequestDto)
    {
        MovieEntity movieEntity = MovieEntity.builder().name(movieRequestDto.getName()).releaseDate(movieRequestDto.getReleaseDate()).duration(movieRequestDto.getDuration()).build();
        try
        {
            movieRepository.save(movieEntity);
        }
        catch (Exception e)
        {
            return "Movie could not be added";
        }
        return "Movie added successfully";
    }
}
