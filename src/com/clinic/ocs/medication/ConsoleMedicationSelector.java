package com.clinic.ocs.medication;

import java.util.List;
import java.util.Scanner;

public class ConsoleMedicationSelector implements MedicationSelector{
    private final MedicationSearchService searchService;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleMedicationSelector(MedicationSearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public SelectedMedication selectMedication() {
        while (true){
            System.out.println("검색할 약물을 입력하세요");
            String keyword = scanner.nextLine();
            List<Medication> results = searchService.search(keyword);
            if (results.isEmpty()) {
                System.out.println("⚠️ 검색 결과가 없습니다. 다시 시도해주세요.");
                continue;
            }
            System.out.println("🔍 검색 결과:");
            for (int i = 0; i < results.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, results.get(i));
            }
            System.out.println("선택할 번호를 입력하세요");
            int selectedIndex = Integer.parseInt(scanner.nextLine())-1;
            if (selectedIndex < 0 || selectedIndex >= results.size()) {
                System.out.println("⚠️ 유효하지 않은 번호입니다.");
                continue;
            }

            Medication selected = results.get(selectedIndex);
            System.out.print("수량을 입력하세요: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            return new SelectedMedication(selected, quantity);
        }
    }
}
