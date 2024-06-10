package com.eTicket.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

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
