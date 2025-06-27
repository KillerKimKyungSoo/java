package com.clinic.ocs.dosage;

import java.util.Scanner;

public class ConsoleDosageInput implements DosageInput{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput() {
        System.out.println("복약지시를 입력하세요");
        return scanner.nextLine();
    }
}
