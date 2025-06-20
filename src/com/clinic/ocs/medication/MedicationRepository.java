package com.clinic.ocs.medication;

import java.util.List;

public interface MedicationRepository {
    List<Medication> findAll();
    List<Medication> searchByName(String keyword);
}
