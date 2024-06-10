package com.eTicket.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "`show`")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String date;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @ManyToOne
    @JoinColumn(name = "movies_id", nullable = false)
    private Movies movies;

    @OneToMany(mappedBy = "show")
    private Set<Booking> booking;

    @OneToMany(mappedBy = "show")
    private Set<ShowSeat> showSeats;
}
