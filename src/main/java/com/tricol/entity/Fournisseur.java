package com.tricol.entity;

//import jakarta.persistence.*;

import jakarta.persistence.*;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String societe;

    @Column(length = 255)
    private String adresse;

    @Column(length = 50)
    private String contact;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String telephone;

    @Column(length = 50)
    private String ville;

    @Column(length = 20, unique = true)
    private String ice; // Identifiant Commun Entreprise

    // Constructeurs
    public Fournisseur() {}

    public Fournisseur(String societe, String adresse, String contact, String email,
                       String telephone, String ville, String ice) {
        this.societe = societe;
        this.adresse = adresse;
        this.contact = contact;
        this.email = email;
        this.telephone = telephone;
        this.ville = ville;
        this.ice = ice;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSociete() { return societe; }
    public void setSociete(String societe) { this.societe = societe; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getIce() { return ice; }
    public void setIce(String ice) { this.ice = ice; }
}
