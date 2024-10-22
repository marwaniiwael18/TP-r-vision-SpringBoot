package com.example.projetdta.Controllers;

import com.example.projetdta.Entities.Projet_Detail;
import com.example.projetdta.Service.IProjetDetailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/projetdetail")
@Tag(name = "Gestion projet detail")
public class ProjetDetailController {

    IProjetDetailService projetDetailService;
    @Operation(description = "ajouter un detail du projet dans la base de données")
    @PostMapping("addprojetdetail")
    public Projet_Detail addProjetDetail(@RequestBody Projet_Detail projetDetail) {
        return projetDetailService.addProjetDetail(projetDetail);
    }

    @GetMapping("getprojetdetail/{idProjetDetail}")
    public Projet_Detail getProjetDetail(@PathVariable("idProjetDetail") long idProjetDetail) {
        return projetDetailService.getProjetDetailById(idProjetDetail);
    }

    @DeleteMapping("/deleteprojetdetail/{id}")
    public void deleteProjetDetail(@PathVariable Long id) {
        projetDetailService.deleteProjetDetailById(id);
    }

    @PutMapping("updateprojetdetail")
    public Projet_Detail updateProjetDetail(@RequestBody Projet_Detail projetDetail) {
        return projetDetailService.updateProjetDetail(projetDetail);
    }

    @GetMapping("getallprojetdetail")
    public List<Projet_Detail> getAllProjetDetail() {
        return projetDetailService.getAllProjetDetail();
    }
}
