package com.tricol.repository;

import com.tricol.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
    List<Fournisseur> findBySocieteContainingIgnoreCase(String societe);
    List<Fournisseur> findByEmailEndingWith(String domain);
}
