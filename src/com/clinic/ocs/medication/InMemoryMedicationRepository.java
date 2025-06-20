package com.clinic.ocs.medication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryMedicationRepository implements MedicationRepository{
    private final List<Medication> medications = Arrays.asList(
            new Medication("M001", "아스피린","정"),
            new Medication("M002", "타이네롤","정"),
            new Medication("M003", "세파클러","캡슐")
    );
    @Override
    public List<Medication> findAll(){
        return medications;
    }
    @Override
    public List<Medication> searchByName(String keyword) {
        return medications.stream()
                .filter(m -> m.getName().contains(keyword))
                .collect(Collectors.toList());
    }
}
