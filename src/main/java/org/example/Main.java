package org.example;


import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        System.out.println("Hello world!");
//        JDBC_Connection con=new JDBC_Connection();
//        con.testCon();
        LeseFromTextDatei leseFromTextDatei=new LeseFromTextDatei();
        leseFromTextDatei.leseText();
    }
}