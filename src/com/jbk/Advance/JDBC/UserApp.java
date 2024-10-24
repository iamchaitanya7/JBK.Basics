package com.jbk.Advance.JDBC;

import java.sql.*;
import java.util.Scanner;

public class UserApp {
    String URL = "jdbc:mysql://localhost:3306/";
    String USERNAME = "root";
    String PASSWORD = "Chaitanya@123";

    public void createDatabase (String dbname) throws SQLException {
        String createDbSQL = "CREATE DATABASE IF NOT EXISTS " + dbname;
        try (Connection conn = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement ( )) {
            stmt.executeUpdate (createDbSQL);
            System.out.println ("Database '" + dbname + "' created successfully or already exists!");
        } catch (SQLException e) {
            System.err.println ("SQL Error: " + e.getMessage ( ));
        }
    }

    void createTable (String dbname, String tablename) {
        String createTableSQL = "CREATE TABLE " + tablename + " ("
                + "user_id INT NOT NULL AUTO_INCREMENT, "
                + "name VARCHAR(100), "
                + "userName VARCHAR(100) UNIQUE, "
                + "passWord VARCHAR(100), "
                + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                + "PRIMARY KEY (user_id))";
        try (Connection conn = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement ( )) {
            stmt.executeUpdate (createTableSQL);
            System.out.println ("Table " + tablename + " created successfully in database " + dbname);
        } catch (SQLException e) {
            System.err.println ("SQL Error: " + e.getMessage ( ));
        }
    }

    void signUp (String dbName, String tableName) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter Full Name: ");
        String name = scanner.next ( );
        System.out.print ("Enter Username: ");
        String username = scanner.next ( );
        System.out.print ("Enter Password: ");
        String password = scanner.next ( );

        String query = "INSERT INTO " + tableName + " (name, username, password) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection (URL + dbName, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = conn.prepareStatement (query)) {
            preparedStatement.setString (1, name);
            preparedStatement.setString (2, username);
            preparedStatement.setString (3, password);
            int rowsAffected = preparedStatement.executeUpdate ( );
            System.out.println ("User signed up successfully! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            System.out.println ("Sign up failed!");
            e.printStackTrace ( );
        }
    }


    public void showUsers (String dbName, String tableName) {
        String query = "SELECT name, created_at FROM " + tableName;
        try (Connection conn = DriverManager.getConnection (URL + dbName, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement ( );
             ResultSet rs = stmt.executeQuery (query)) {
            System.out.println ("\n===== List of Users =====");
            while (rs.next ( )) {
                System.out.println ("Name: " + rs.getString ("name")
                        + ", Created At: " + rs.getString ("created_at"));
            }
        } catch (SQLException e) {
            System.out.println ("Failed to retrieve users.");
            e.printStackTrace ( );
        }
    }

    void loginUser (String dbName, String tableName) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter Username: ");
        String username = scanner.nextLine ( );
        System.out.print ("Enter Password: ");
        String password = scanner.nextLine ( );

        String query = "SELECT * FROM " + tableName + " WHERE username = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection (URL + dbName, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement (query)) {
            pstmt.setString (1, username);
            pstmt.setString (2, password);
            ResultSet rs = pstmt.executeQuery ( );

            if (rs.next ( )) {
                System.out.println ("Login successful! Welcome, " + rs.getString ("name") + ".");
            } else {
                System.out.println ("Invalid username or password.");
            }
        } catch (SQLException e) {
            System.out.println ("Login failed!");
            e.printStackTrace ( );
        }
    }
}