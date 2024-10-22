package com.example.projetdta.Repositories;

import com.example.projetdta.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
