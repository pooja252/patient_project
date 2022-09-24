package com.patientregistrationservice.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientregistrationservice.demo.Entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
