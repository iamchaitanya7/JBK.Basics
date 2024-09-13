package com.jbk.Advance.JDBC;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class DemoA {
    void separator () {
        System.out.println ("============================================");
    }

    //Simple Program to Connect to the (MySQL 8.0.36) Database.
    public static void main (String[] args) throws ClassNotFoundException, SQLException {
        DemoA line = new DemoA ( );

        //Loading the jdbc.driver
        Class.forName ("com.mysql.cj.jdbc.Driver");
        System.out.println ("Driver Class is Loaded....!");

        // Url path should be as : jbbc driver name; ip address; port no; db name;
        String urlPath = "jdbc:mysql://localhost:3306/db1196";
        String userName = "root";
        String passWord = "Chaitanya@123";
        Connection connection = DriverManager.getConnection (urlPath, userName, passWord);
        if (connection == null) {
            System.out.println ("Could Not Establish Connection to Database....!");
        } else {
            System.out.println ("Connection is Established Successfully....!");
        }

    }
}
