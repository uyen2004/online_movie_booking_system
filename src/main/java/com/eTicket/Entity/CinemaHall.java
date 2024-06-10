package com.eTicket.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "cinema_hall")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String name;

    @Column(name = "total_seats")
    private Integer totalSeats;

    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema;

    @OneToMany(mappedBy = "cinemaHall")
    private Set<CinemaSeat> cinemaSeats;
}
