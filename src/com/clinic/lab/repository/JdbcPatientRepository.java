package com.clinic.lab.repository;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.clinic.lab.model.Patient;

public class JdbcPatientRepository implements PatientRepository{
    @Override
    public List<Patient> findAll() throws Exception {
        return List.of();
    }
}
