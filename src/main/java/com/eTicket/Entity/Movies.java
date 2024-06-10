package com.eTicket.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "movies")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String title;

    @Column
    private String language;

    @Column
    private String overview;

    @Column
    private String posterUrl;

    @Column
    private boolean adult;

    @Column
    private String genre;

    @OneToMany(mappedBy = "movies")
    private Set<Show> shows;

}
