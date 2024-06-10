package com.eticket.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cinema_seat")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CinemaSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "seat_num")
    private String seatNum;

    @Column
    private String type;

    @ManyToOne
    @JoinColumn(name = "cinema_hall_id")
    private CinemaHall cinemaHall;
}
