package com.tricol.controller;

import com.tricol.entity.Fournisseur;
import com.tricol.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/fournisseurs")
public class FournisseurController {

    @Autowired
    private FournisseurService fournisseurService;

    // 🔹 Récupérer tous les fournisseurs
    @GetMapping
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurService.getAllFournisseurs();
    }

    // 🔹 Récupérer un fournisseur par ID
    @GetMapping("/{id}")
    public Fournisseur getFournisseurById(@PathVariable Long id) {
        return fournisseurService.getFournisseurById(id);
    }

    // 🔹 Ajouter un nouveau fournisseur
    @PostMapping
    public Fournisseur createFournisseur(@RequestBody Fournisseur fournisseur) {
        fournisseurService.saveFournisseur(fournisseur);
        return fournisseur;
    }

    // 🔹 Mettre à jour un fournisseur
    @PutMapping("/{id}")
    public Fournisseur updateFournisseur(@PathVariable Long id, @RequestBody Fournisseur fournisseur) {
        fournisseurService.updateFournisseur(id, fournisseur);
        return fournisseur;
    }

    // 🔹 Supprimer un fournisseur
    @DeleteMapping("/{id}")
    public String deleteFournisseur(@PathVariable Long id) {
        fournisseurService.deleteFournisseur(id);
        return "Fournisseur supprimé avec succès";
    }
}
