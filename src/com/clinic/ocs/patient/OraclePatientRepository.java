package com.clinic.ocs.patient;
import java.sql.*;
import java.util.*;
import java.util.List;

public class OraclePatientRepository implements PatientRepository{
    @Override
    public List<Patient> findAll() {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT patient_id, name, age FROM patients";

        try (Connection conn = OracleConnectionUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String id = rs.getString("patient_id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                patients.add(new Patient(id, name, age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patients;
    }
}
