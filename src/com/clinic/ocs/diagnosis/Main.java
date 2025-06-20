package com.clinic.ocs.diagnosis;

import com.clinic.ocs.patient.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //환자조회
        PatientRepository repository = new InMemoryPatientRepository();
        PatientPrinter printer = new ConsolePatientPrinter();
        List<Patient> patientList = repository.findAll();
        printer.printAll(patientList);
        //진단입력
        DiagnosisInput input = new ConsoleDiagnosisInput();
        DiagnosisValidator validator = new BasicDiagnosisValidator();
        DiagnosisService service = new DiagnosisService(input,validator);

        Diagnosis diagnosis = service.inputDiagnosis();
        System.out.println("✅ 입력된 진단 정보: " + diagnosis);
    }
}
