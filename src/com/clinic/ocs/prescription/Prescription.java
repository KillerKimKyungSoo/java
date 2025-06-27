package com.clinic.ocs.prescription;

import com.clinic.ocs.diagnosis.Diagnosis;
import com.clinic.ocs.patient.Patient;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prescription {
    private final Patient patient;
    private final Diagnosis diagnosis;
    private LocalDateTime createdAt;
    private final List<PrescriptionItem> items;
    public Prescription(Patient patient, Diagnosis diagnosis){
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.createdAt=LocalDateTime.now();
        this.items=new ArrayList<>();
    }
    public Patient getPatient() {
        return patient;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<PrescriptionItem> getItems() {
        return items;
    }

    public void addItem(PrescriptionItem item) {
        items.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== 처방서 =====\n");
        sb.append("환자 정보: ").append(patient.toString()).append("\n");
        sb.append("진단: ").append(diagnosis.toString()).append("\n");
        sb.append("작성일: ").append(createdAt).append("\n");
        sb.append("처방 내역:\n");
        for (PrescriptionItem item : items) {
            sb.append(" - ").append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
