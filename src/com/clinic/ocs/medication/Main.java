package com.clinic.ocs.medication;

import com.clinic.ocs.diagnosis.*;
import com.clinic.ocs.patient.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PatientRepository repository = new InMemoryPatientRepository();
        PatientPrinter printer = new ConsolePatientPrinter();
        List<Patient> patientList = repository.findAll();
        printer.printAll(patientList);

        DiagnosisInput input = new ConsoleDiagnosisInput();
        DiagnosisValidator validator = new BasicDiagnosisValidator();
        DiagnosisService diagnosisService = new DiagnosisService(input,validator);
        Diagnosis diagnosis = diagnosisService.inputDiagnosis();
        System.out.println("입력된 진단" + diagnosis);

        MedicationRepository medRepo = new InMemoryMedicationRepository();
        MedicationSearchService medicationSearchService = new MedicationSearchService(medRepo);
        MedicationSelector selector = new ConsoleMedicationSelector(medicationSearchService);
        SelectedMedication selectedMedication = selector.selectMedication();
        System.out.println("✅ 선택된 약물: " + selectedMedication);
    }
}
