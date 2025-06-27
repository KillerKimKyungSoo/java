package com.clinic.ocs.patient;
import java.util.List;
public class PatientConsoleView {
    private final PatientService service;

    public PatientConsoleView(PatientService service) {
        this.service = service;
    }

    public void showPatientList() {
        System.out.println("\n📋 전체 환자 목록:");
        List<Patient> patients = service.getAllPatients();
        for (Patient p : patients) {
            System.out.println("  - " + p);
        }
    }
}
