package com.patientregistrationservice.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.patientregistrationservice.demo.Entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

    @Query("select CONCAT_WS(td.first_name,td.last_name) AS user_name from registration_tb td")
    public String updateusername();

}
