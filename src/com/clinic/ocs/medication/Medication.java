package com.clinic.ocs.medication;

public class Medication {
    private final String code;
    private final String name;
    private final String unit;

    public Medication(String code, String name, String unit) {
        this.code = code;
        this.name = name;
        this.unit = unit;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
