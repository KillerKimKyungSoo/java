package com.clinic.ocs.patient;

import java.util.List;

public interface PatientRepository {
    List<Patient> findAll();
}
