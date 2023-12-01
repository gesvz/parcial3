package com.example.demo.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.jdbc.Driver;

public class Conexion {
    public Connection openDb() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chichemes","root","mysql");
            return con;
        } catch (SQLException e) {
            System.out.println("connection/driver error");
            e.printStackTrace();
            int x = 1;
        } catch (ClassNotFoundException cnfex) {
            System.out.println("CNFEX error");
            int x = 1;
        }
        return null;
    }
}