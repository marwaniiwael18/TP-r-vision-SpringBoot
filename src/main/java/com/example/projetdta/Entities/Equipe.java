package com.example.projetdta.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String specialite;
    @Enumerated(EnumType.STRING)
    private Domaine typeDomaine;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Projet> projets;
}
