package com.example.projetdta.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projet_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String technologie;
    private Long cout_provisoire;
    private Date dateDebut;
    @OneToOne(mappedBy=
            "projetDetail")
    private Projet projet;
}
