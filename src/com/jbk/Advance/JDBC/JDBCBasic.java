package com.jbk.Advance.JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCBasic {
    public static void main (String[] args) throws ClassNotFoundException, SQLException {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        System.out.println (1);
        String urlPath = "jdbc:mysql://localhost:3306/db1196";
        String userName = "root";
        String passWord = "Chaitanya@123";

        Scanner scanner = new Scanner (System.in);

        Connection connection = DriverManager.getConnection (urlPath, userName, passWord);
        Statement statement = connection.createStatement ( );

        System.out.println ("Enter a Id: ");
        int id = scanner.nextInt ( );
        System.out.println ("Enter a Name: ");
        String name = scanner.next ( );
        System.out.println ("Enter a Mobile No: ");
        String mobile = scanner.next ( );
        System.out.println ("Enter a Email: ");
        String email = scanner.next ( );
        System.out.println ("Enter a Salary: ");
        double salary = scanner.nextDouble ( );

        String insertQuery = "INSERT INTO customer (idcustomer, customerName, customerMobileNo, customerEmail, customerSalary) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement (insertQuery);
        preparedStatement.setInt (1, id);
        preparedStatement.setString (2, name);
        preparedStatement.setString (3, mobile);
        preparedStatement.setString (4, email);
        preparedStatement.setDouble (5, salary);


        int rowsAffected = preparedStatement.executeUpdate ( );
        System.out.println ("Data inserted successfully. " + rowsAffected + " row(s) inserted.");


        ResultSet rs = statement.executeQuery ("SELECT * FROM customer");
        while (rs.next ( )) {
            System.out.println (rs.getInt (1) + " " +
                    rs.getString (2) + " "
                    + rs.getString (3) + " "
                    + rs.getString (4) + " "
                    + rs.getString (5));
        }

        scanner.close ( );
        rs.close ( );
        preparedStatement.close ( );
        statement.close ( );
        connection.close ( );
    }
}