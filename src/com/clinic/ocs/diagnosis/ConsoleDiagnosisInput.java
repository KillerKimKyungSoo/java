package com.clinic.ocs.diagnosis;

import java.util.Scanner;

public class ConsoleDiagnosisInput implements DiagnosisInput{
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public String getInput() {
        System.out.println("진단명을 입력하세요");
        return scanner.nextLine();
    }
}
