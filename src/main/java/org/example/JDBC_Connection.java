package org.example;

import java.sql.*;

public class JDBC_Connection {
    public void testCon() throws SQLException, ClassNotFoundException {

        final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";


        final String USER = "root";
        final String PASS = "";

        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement sta = conn.createStatement();
        ResultSet res = sta.executeQuery("SELECT * FROM vorname ;");
        while (res.next()) {
            System.out.println(res.getString("name"));
        }
        sta.close();
        res.close();
        conn.close();


    }
}

