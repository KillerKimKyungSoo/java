package com.clinic.lab.model;

public class LabTest {
    private String code;
    private String name;

    public LabTest(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LabTest{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
