package com.example.projetdta.Service;

import com.example.projetdta.Entities.Equipe;
import com.example.projetdta.Repositories.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService {

    EquipeRepository equipeRepository;
    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
    @Override
    public Equipe getEquipeById(long idEquipe) {
        return equipeRepository.findById(idEquipe).orElse(null);
    }
    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
    @Override
    public void deleteEquipeById(Long id) {
        equipeRepository.deleteById(id);
    }
    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }
}
