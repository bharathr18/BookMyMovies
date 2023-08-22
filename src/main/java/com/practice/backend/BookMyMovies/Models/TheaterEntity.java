package com.practice.backend.BookMyMovies.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theater")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String city;
    private String address;

    //List of theater seats
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> theaterSeatEntityList;

    //List of shows
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;
}
