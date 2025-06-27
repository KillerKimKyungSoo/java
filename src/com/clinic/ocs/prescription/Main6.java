package com.clinic.ocs.prescription;
import com.clinic.ocs.patient.*;
import com.clinic.ocs.diagnosis.*;
import com.clinic.ocs.medication.*;
import com.clinic.ocs.dosage.*;
import com.clinic.ocs.prescription.*;

import java.util.List;
public class Main6 {
    public static void main(String[] args) {
        // 1. 환자 목록 조회 (기본선택: 첫 번째 환자)
        PatientRepository patientRepository = new InMemoryPatientRepository();
        PatientPrinter patientPrinter = new ConsolePatientPrinter();
        List<Patient> patients = patientRepository.findAll();
        patientPrinter.printAll(patients);
        Patient selectedPatient = patients.get(0); // 간단히 첫 환자 선택

        // 2. 진단 입력
        DiagnosisInput diagnosisInput = new ConsoleDiagnosisInput();
        DiagnosisValidator diagnosisValidator = new BasicDiagnosisValidator();
        DiagnosisService diagnosisService = new DiagnosisService(diagnosisInput, diagnosisValidator);
        Diagnosis diagnosis = diagnosisService.inputDiagnosis();

        // 3. 약물 검색 및 선택
        MedicationRepository medicationRepository = new InMemoryMedicationRepository();
        MedicationSearchService medicationSearchService = new MedicationSearchService(medicationRepository);
        MedicationSelector medicationSelector = new ConsoleMedicationSelector(medicationSearchService);
        SelectedMedication selectedMedication = medicationSelector.selectMedication();

        // 4. 복약 지시 입력
        DosageInput dosageInput = new ConsoleDosageInput();
        DosageValidator dosageValidator = new BasicDosageValidator();
        DosageService dosageService = new DosageService(dosageInput, dosageValidator);
        DosageInstruction dosageInstruction = dosageService.inputInstruction();

        // 5. 처방서 생성 및 처방 항목 추가
        Prescription prescription = new Prescription(selectedPatient, diagnosis);
        PrescriptionItem prescriptionItem = new PrescriptionItem(
                selectedMedication.getMedication(),
                selectedMedication.getQuantity(),
                dosageInstruction);
        PrescriptionService prescriptionService = new PrescriptionService(prescription);
        prescriptionService.addPrescriptionItem(prescriptionItem);

        // 6. 처방서 출력
        PrescriptionPrinter prescriptionPrinter = new PrescriptionPrinter();
        prescriptionPrinter.print(prescription);
    }
}
