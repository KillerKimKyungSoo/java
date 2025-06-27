package com.clinic.ocs.patient;
import java.util.List;
public class PatientService {

        private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
            this.repository = repository;
        }

        public List<Patient> getAllPatients() {
            return repository.findAll();
        }
}
