package com.clinic.ocs.patient;

import java.util.Arrays;
import java.util.List;

public class InMemoryPatientRepository implements  PatientRepository{
    @Override
    public List<Patient> findAll() {
        return Arrays.asList(
                new Patient("P001","김철수", 45),
                new Patient("P002","이영희", 55),
                new Patient("P003","박지민", 66)
        );
    }
}
