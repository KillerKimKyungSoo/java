package com.clinic.ocs.patient;

public class ConsolePatientPrinter extends  PatientPrinter{
    @Override
    protected void printPaient(Patient patient) {
        System.out.println(patient.toString());
    }
}
