package com.eticket.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "booking")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "num_of_seats")
    private Integer numOfSeats;

    @Column(name = "time_stamp")
    private String timeStamp;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean status;

    @ManyToOne
    @JoinColumn (name = "show_id", nullable = false)
    private Show show;

    @OneToOne(mappedBy = "booking")
    private ShowSeat showSeat;
}
