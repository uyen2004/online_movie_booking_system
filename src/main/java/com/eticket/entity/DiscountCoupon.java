package com.eticket.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "discount_coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiscountCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String code;

    @Column
    private Integer amount;

    @Column
    private String startDate;

    @Column
    private String endDate;

}
