package com.clinic.ocs.prescription;

public class PrescriptionService {
    private final Prescription prescription;

    public PrescriptionService(Prescription prescription) {
        this.prescription = prescription;
    }
    public void addPrescriptionItem(PrescriptionItem item){
        prescription.addItem(item);
    }
    public Prescription getPrescription(){
        return prescription;
    }
}
