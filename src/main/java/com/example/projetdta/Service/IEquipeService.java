package com.example.projetdta.Service;

import com.example.projetdta.Entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe addEquipe(Equipe equipe);
    Equipe getEquipeById(long idEquipe);
    Equipe updateEquipe(Equipe equipe);
    void deleteEquipeById(Long id);

    List<Equipe> getAllEquipe();

}

