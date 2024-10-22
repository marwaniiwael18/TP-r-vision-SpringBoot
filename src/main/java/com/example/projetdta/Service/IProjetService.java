package com.example.projetdta.Service;

import com.example.projetdta.Entities.Projet;

import java.util.List;

public interface IProjetService {

    Projet addProjet(Projet projet);
    Projet getProjetById(long idProjet);
    Projet updateProjet(Projet projet);

    public void deleteProjetById(Long id);
    List<Projet> getAllProjet();
}
