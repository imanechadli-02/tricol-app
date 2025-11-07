package com.tricol.service;

import com.tricol.entity.Fournisseur;
import com.tricol.repository.FournisseurRepository;
import com.tricol.service.FournisseurService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    private final FournisseurRepository fournisseurRepository;

    public FournisseurServiceImpl(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    @Override
    public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur updateFournisseur(Long id, Fournisseur fournisseur) {
        Optional<Fournisseur> existing = fournisseurRepository.findById(id);
        if (existing.isPresent()) {
            Fournisseur f = existing.get();
            f.setSociete(fournisseur.getSociete());
            f.setAdresse(fournisseur.getAdresse());
            f.setContact(fournisseur.getContact());
            f.setEmail(fournisseur.getEmail());
            f.setTelephone(fournisseur.getTelephone());
            f.setVille(fournisseur.getVille());
            f.setIce(fournisseur.getIce());
            return fournisseurRepository.save(f);
        }
        return null;
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public Fournisseur getFournisseurById(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public List<Fournisseur> searchBySociete(String societe) {
        return fournisseurRepository.findBySocieteContainingIgnoreCase(societe);
    }
}
