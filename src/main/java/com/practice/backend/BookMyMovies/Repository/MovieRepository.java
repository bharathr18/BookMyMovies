package com.practice.backend.BookMyMovies.Repository;

import com.practice.backend.BookMyMovies.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
}
