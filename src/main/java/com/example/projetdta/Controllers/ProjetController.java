package com.example.projetdta.Controllers;

import com.example.projetdta.Entities.Projet;
import com.example.projetdta.Service.IProjetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/projet")
@Tag(name = "Gestion Projet")
public class ProjetController {

    IProjetService projetService;
    @Operation(description = "ajouter un Projet dans la base de données")
    @PostMapping("addprojet")
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.addProjet(projet);
    }

    @GetMapping("getprojet/{idProjet}")
    public Projet getProjet(@PathVariable("idProjet") long idProjet) {
        return projetService.getProjetById(idProjet);
    }

    @DeleteMapping("/deleteprojet/{id}")
    public void deleteProjet(@PathVariable Long id) {
        projetService.deleteProjetById(id);
    }

    @PutMapping("updateprojet")
    public Projet updateProjet(@RequestBody Projet projet) {
        return projetService.updateProjet(projet);
    }

    @GetMapping("getallprojet")
    public List<Projet> getAllProjet() {
        return projetService.getAllProjet();
    }
}
