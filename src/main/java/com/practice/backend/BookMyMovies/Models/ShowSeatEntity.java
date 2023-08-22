package com.practice.backend.BookMyMovies.Models;

import com.practice.backend.BookMyMovies.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "show_seats")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int rate;
    private int seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private boolean booked;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private TicketEntity ticket;

    @ManyToOne
    @JoinColumn
    private ShowEntity show;
}
