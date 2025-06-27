package com.clinic.ocs.patient;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        PatientRepository repository = new OraclePatientRepository();
        PatientService service = new PatientService(repository);
        PatientConsoleView view = new PatientConsoleView(service);

        view.showPatientList();



        //PatientRepository repository = new InMemoryPatientRepository();
        //PatientPrinter printer = new ConsolePatientPrinter();
        //List<Patient> patientList = repository.findAll();
        //printer.printAll(patientList);
    }
}
