package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private Date dateNaissance;
    private  boolean malade;
    private int score;

    @OneToMany
    @JoinColumn(name = "patient_id")
    private List<Consultation> consultations;
    @OneToMany
    @JoinColumn(name = "patient_id")
    private List<RendezVous> rendezVousList;
    public Patient() {
    }

    public Patient(Long id, String nom, Date dateNaissance, boolean malade, int score) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.malade = malade;
        this.score = score;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isMalade() {
        return malade;
    }

    public void setMalade(boolean malade) {
        this.malade = malade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
