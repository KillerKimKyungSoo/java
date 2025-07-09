package com.clinic.lab.model;

import java.util.ArrayList;
import java.util.List;

public class LabTestOrder {
    private Long orderId;
    private Patient patient;
    private List<LabTestOrderItem> items = new ArrayList<>();

    public LabTestOrder(Patient patient) {
        this.patient = patient;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Patient getPatient() {
        return patient;
    }

    public List<LabTestOrderItem> getItems() {
        return items;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public void addItem(LabTestOrderItem item){
        items.add(item);
    }
}
