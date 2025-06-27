package com.clinic.ocs.dosage;

public class DosageService {
    private final DosageInput input;
    private final DosageValidator validator;

    public DosageService(DosageInput input, DosageValidator validator) {
        this.input = input;
        this.validator = validator;
    }

    public DosageInstruction inputInstruction(){
        while(true){
            String text = input.getInput();
            if(validator.isValid(text)){
                return new DosageInstruction(text);
            }
            else
            {
                System.out.println("⚠️ 유효하지 않은 복약 지시입니다. 다시 입력해주세요.");
            }
        }
    }
}
