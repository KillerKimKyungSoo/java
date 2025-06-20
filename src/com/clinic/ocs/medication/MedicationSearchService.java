package com.clinic.ocs.medication;

import java.util.List;

public class MedicationSearchService {
    private final MedicationRepository repository;

    public MedicationSearchService(MedicationRepository repository) {
        this.repository = repository;
    }

    public List<Medication> search(String keyword){
        return repository.searchByName(keyword);
    }
}
