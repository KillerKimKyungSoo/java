package com.clinic.ocs.diagnosis;

import java.time.LocalDateTime;

public class Diagnosis {
    private final String description;
    private final LocalDateTime createdAt;

    public Diagnosis(String description ) {
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

    public String getDescription(){
        return description;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
