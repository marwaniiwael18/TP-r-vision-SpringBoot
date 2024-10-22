package com.example.projetdta.Controllers;

import com.example.projetdta.Entities.Equipe;
import com.example.projetdta.Service.IEquipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/equipe")
@Tag(name = "Gestion Equipe")
public class EquipeController {

    IEquipeService equipeService;
    @Operation(description = "ajouter un Equipe dans la base de données")
    @PostMapping("addequipe")
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }
    @GetMapping("getequipe/{idEquipe}")
    public Equipe getEquipe(@PathVariable("idEquipe") long idEquipe) {
        return equipeService.getEquipeById(idEquipe);
    }
    @DeleteMapping("/deleteequipe/{id}")
    public void deleteEquipe(@PathVariable Long id) {
        equipeService.deleteEquipeById(id);
    }

    @PutMapping("updateequipe")
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }
    @GetMapping("getallequipe")
    public List<Equipe> getAllEquipe() {
        return equipeService.getAllEquipe();
    }
}

