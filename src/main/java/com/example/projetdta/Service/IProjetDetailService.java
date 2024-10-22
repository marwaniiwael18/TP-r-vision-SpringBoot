package com.example.projetdta.Service;

import com.example.projetdta.Entities.Projet_Detail;

import java.util.List;

public interface IProjetDetailService {

    Projet_Detail addProjetDetail(Projet_Detail projetDetail);
    Projet_Detail getProjetDetailById(long idProjetDetail);
    Projet_Detail updateProjetDetail(Projet_Detail projetDetail);
    public void deleteProjetDetailById(Long id);
    List<Projet_Detail> getAllProjetDetail();
}
