package com.example.demo.repositories;

import com.example.demo.model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    List<Consultation> findByPatientId(Long patientId);
    List<Consultation> findByMedecinId(Long medecinId);
    // Add more custom query methods if needed
}