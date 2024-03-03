package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    @ManyToOne
    @JoinColumn(name = "patient_id")

    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "medecin_id")

    private Medecin medecin;

    public RendezVous() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
