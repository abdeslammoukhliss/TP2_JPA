package com.example.demo;

import com.example.demo.model.Patient;
import com.example.demo.model.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Demo4Application  implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajouter des patients
        Patient patient1 = new Patient(12L,"Nom1", new Date(), true, 80);
        Patient patient2 = new Patient(13L,"Nom2", new Date(), false, 60);

        patientRepository.saveAll(List.of(patient1, patient2));

        // Consulter tous les patients
        List<Patient> patients = patientRepository.findAll();
        System.out.println("Tous les patients : " + patients);

        // Consulter un patient
        Long patientId = 1L;
        patientRepository.findById(patientId).ifPresent(patient -> {
            System.out.println("Patient avec ID " + patientId + " : " + patient);
        });

        // Chercher des patients par nom
        String nomRecherche = "Nom1";
        List<Patient> patientsParNom = patientRepository.findByNom(nomRecherche);
        System.out.println("Patients avec le nom '" + nomRecherche + "' : " + patientsParNom);

        // Mettre à jour un patient
        Long patientIdToUpdate = 1L;
        patientRepository.findById(patientIdToUpdate).ifPresent(patient -> {
            patient.setMalade(false);
            patientRepository.save(patient);
        });

        // Supprimer un patient
        Long patientIdToDelete = 2L;
        patientRepository.deleteById(patientIdToDelete);
    }
}
