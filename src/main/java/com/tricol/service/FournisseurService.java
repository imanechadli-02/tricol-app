package com.tricol.service;

import com.tricol.entity.Fournisseur;
import java.util.List;

public interface FournisseurService {
    Fournisseur saveFournisseur(Fournisseur fournisseur);
    Fournisseur updateFournisseur(Long id, Fournisseur fournisseur);
    void deleteFournisseur(Long id);
    Fournisseur getFournisseurById(Long id);
    List<Fournisseur> getAllFournisseurs();
    List<Fournisseur> searchBySociete(String societe);
}
