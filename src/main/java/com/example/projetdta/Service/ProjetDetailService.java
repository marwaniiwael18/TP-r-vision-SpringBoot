package com.example.projetdta.Service;

import com.example.projetdta.Entities.Projet_Detail;
import com.example.projetdta.Repositories.ProjetDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailService implements IProjetDetailService {

    ProjetDetailRepository projetDetailRepository;

    @Override
    public Projet_Detail addProjetDetail(Projet_Detail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public Projet_Detail getProjetDetailById(long idProjetDetail) {
        return projetDetailRepository.findById(idProjetDetail).orElse(null);
    }

    @Override
    public Projet_Detail updateProjetDetail(Projet_Detail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public void deleteProjetDetailById(Long id) {
        projetDetailRepository.deleteById(id);
    }

    @Override
    public List<Projet_Detail> getAllProjetDetail() {
        return projetDetailRepository.findAll();
    }
}
