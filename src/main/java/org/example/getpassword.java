package org.example;

import java.sql.*;

public class getpassword {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = null;
        String url = "jdbc:oracle:thin:@43.139.94.243:1521:orcl";
        connection = DriverManager.getConnection(url, "XYS", "Grcl1234XyS");
        String sql = "SELECT * FROM USERS";
        PreparedStatement pstmt=connection.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()) {
            String dname = rs.getString("PASSWORD");
            System.out.println(dname);
        }
        connection.close();
        }

    }

