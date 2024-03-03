package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String specialite;
    @OneToMany
    @JoinColumn(name = "medecin_id")
    private List<Consultation> consultations;
    @OneToMany
    @JoinColumn(name = "medecin_id")
    private List<RendezVous> rendezVousList;

    public Medecin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
