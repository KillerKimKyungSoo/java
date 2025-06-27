package com.clinic.ocs.dosage;

public class DosageInstruction {
    private final String  instructionText;
    public DosageInstruction(String instructionText){
        this.instructionText = instructionText;
    }
    public String getInstructionText(){
        return instructionText;
    }
    @Override
    public String toString() {
        return "복약 지시: " + instructionText;
    }
}
