package com.clinic.ocs.patient;

import java.util.List;

public abstract class PatientPrinter {
    public final void printAll(List<Patient> patients){
        System.out.println("==========환자목록==========");
        for(Patient p : patients){
            printPaient(p);
        }
    }
    protected abstract void printPaient(Patient patient);
}
