package com.eticket.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private Double amount;
    @Column(name = "time_stamp")
    private String timeStamp;
    @Column(name = "payment_method")
    private String paymentMethod;

    @OneToOne
    @JoinColumn(name = "discountcoupon_id")
    private DiscountCoupon discountCoupon;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
}
