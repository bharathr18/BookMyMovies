package com.practice.backend.BookMyMovies.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movies")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    private int duration;
    private Date releaseDate;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;
}
