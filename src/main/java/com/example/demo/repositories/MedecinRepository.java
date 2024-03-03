package com.example.demo.repositories;

import com.example.demo.model.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    List<Medecin> findByNom(String nom);
    // Add more custom query methods if needed
}