package com.practice.backend.BookMyMovies.Models;

import com.practice.backend.BookMyMovies.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "theaterseats")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;
    private int rate;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;

    public TheaterSeatEntity(String seatNo, SeatType seatType, int rate)
    {
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.rate = rate;
    }
}
