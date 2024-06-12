package com.eticket.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "show_seat")
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean status;

    @Column
    private Double price;

    @ManyToOne
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @OneToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @OneToOne
    @JoinColumn(name = "cinema_seat_id", nullable = false)
    private CinemaSeat cinemaSeat;

}
