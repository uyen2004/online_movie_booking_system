package com.eticket.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "cities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String name;

    @OneToMany(mappedBy = "city")
    private Set<Cinema> cinema;
}
