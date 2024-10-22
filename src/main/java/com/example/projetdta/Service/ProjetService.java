package com.example.projetdta.Service;

import com.example.projetdta.Entities.Projet;
import com.example.projetdta.Repositories.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetService implements IProjetService {

    ProjetRepository projetRepository;

    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet getProjetById(long idProjet) {
        return projetRepository.findById(idProjet).orElse(null);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjetById(Long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public List<Projet> getAllProjet() {
        return projetRepository.findAll();
    }
}
