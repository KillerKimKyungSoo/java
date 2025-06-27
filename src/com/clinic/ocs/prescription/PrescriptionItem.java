package com.clinic.ocs.prescription;

import com.clinic.ocs.dosage.DosageInstruction;
import com.clinic.ocs.medication.Medication;

public class PrescriptionItem {
    private final Medication medication;
    private final int quantity;
    private final DosageInstruction dosageInstruction;

    public PrescriptionItem(Medication medication, int quantity, DosageInstruction dosageInstruction) {
        this.medication = medication;
        this.quantity = quantity;
        this.dosageInstruction = dosageInstruction;
    }

    public Medication getMedication() {
        return medication;
    }

    public int getQuantity() {
        return quantity;
    }

    public DosageInstruction getDosageInstruction() {
        return dosageInstruction;
    }

    @Override
    public String toString() {
        return "PrescriptionItem{" +
                "medication=" + medication +
                ", quantity=" + quantity +
                ", dosageInstruction=" + dosageInstruction +
                '}';
    }
}
