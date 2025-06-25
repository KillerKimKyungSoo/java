package com.clinic.ocs.dosage;

public class BasicDosageValidator implements DosageValidator{
    @Override
    public boolean isValid(String instructionText) {
        return instructionText != null && !instructionText.trim().isEmpty() && instructionText.length() <= 100;
    }
}
