package com.clinic.ocs.patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class OracleConnectionUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 포트 및 SID 확인 필요
        String user = "system";
        String password = "godori";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 수동 로딩
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("JDBC 드라이버 로딩 실패", e);
        }

        return DriverManager.getConnection(url, user, password);
    }
}
