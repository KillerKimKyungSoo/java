package com.clinic.ocs.medication;

public class SelectedMedication {
    private final Medication medication;
    private final int quantity;

    public SelectedMedication(Medication medication, int quantity) {
        this.medication = medication;
        this.quantity = quantity;
    }

    public Medication getMedication() {
        return medication;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "SelectedMedication{" +
                "medication=" + medication +
                ", quantity=" + quantity +
                '}';
    }
}
