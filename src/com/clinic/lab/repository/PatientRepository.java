package com.clinic.lab.repository;

import com.clinic.lab.model.Patient;

import java.util.List;

public interface PatientRepository {
    List<Patient> findAll() throws Exception;
}
