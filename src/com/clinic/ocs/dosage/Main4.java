package com.clinic.ocs.dosage;

public class Main4 {
    public static void main(String[] args) {
        DosageInput dosageInput = new ConsoleDosageInput();
        DosageValidator dosageValidator = new BasicDosageValidator();
        DosageService dosageService = new DosageService(dosageInput,dosageValidator);
        DosageInstruction instruction = dosageService.inputInstruction();
        System.out.println("✅ 복약 지시 완료: " + instruction);
    }
}
