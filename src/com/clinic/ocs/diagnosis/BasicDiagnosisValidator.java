package com.clinic.ocs.diagnosis;

public class BasicDiagnosisValidator implements DiagnosisValidator {
    @Override
    public boolean isValid(String diagnosis) {
        return diagnosis != null && !diagnosis.trim().isEmpty() && diagnosis.length() <= 100;
    }
}
