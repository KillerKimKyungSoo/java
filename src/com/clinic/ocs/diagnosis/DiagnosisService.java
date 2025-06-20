package com.clinic.ocs.diagnosis;

public class DiagnosisService {
    private final DiagnosisInput input;
    private final DiagnosisValidator validator;

    public DiagnosisService(DiagnosisInput input, DiagnosisValidator validator) {
        this.input = input;
        this.validator = validator;
    }

    public Diagnosis inputDiagnosis(){
        while(true){
             String description = input.getInput();
             if(validator.isValid(description)){
                 return new Diagnosis(description);
             }
             else {
                 System.out.println("유효하지 않은 진단명입니다.");

             }
        }
    }
}
