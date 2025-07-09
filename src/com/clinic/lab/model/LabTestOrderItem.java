package com.clinic.lab.model;

public class LabTestOrderItem {
    private LabTest labTest;
    private String instructions;
    private boolean urgent;

    public LabTestOrderItem(LabTest labTest, String instructions, boolean urgent) {
        this.labTest = labTest;
        this.instructions = instructions;
        this.urgent = urgent;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public String getInstructions() {
        return instructions;
    }

    public boolean isUrgent() {
        return urgent;
    }
}
