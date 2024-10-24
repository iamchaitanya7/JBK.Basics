package com.jbk.Advance.JDBC;

import java.sql.*;

public class doctorJDBC {
    String URL = "jdbc:mysql://localhost:3306/";
    String USERNAME = "root";
    String PASSWORD = "Chaitanya@123";

    //Creating a Database with Predefined name.
    void createDatabase (String dbname) throws SQLException {
        String createDbSQL = "CREATE DATABASE IF NOT EXISTS " + dbname;
        try (Connection conn = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement ( )) {
            stmt.executeUpdate (createDbSQL);
            System.out.println ("Database '" + dbname + "' created successfully or already exists!");
        } catch (SQLException e) {
            System.err.println ("SQL Error: " + e.getMessage ( ));
        }
    }

    //Creating Table into Database.
    void createTable (String dbname, String tablename) {
        String createTableSQL = "CREATE TABLE " + tablename + " ("
                + "doc_id INT NOT NULL AUTO_INCREMENT, "
                + "doc_name VARCHAR(100), "
                + "doc_speciality VARCHAR(100), "
                + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                + "PRIMARY KEY (doc_id))";
        try (Connection conn = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement ( )) {
            stmt.executeUpdate (createTableSQL);
            System.out.println ("Table " + tablename + " created successfully in database " + dbname);
        } catch (SQLException e) {
            System.err.println ("SQL Error: " + e.getMessage ( ));
        }
    }


    // Method to insert data with error handling
    void insertValues (String dbname, String tablename, String name, String spec) {
        String insertSQL = "INSERT INTO " + tablename + "(doc_name, doc_speciality) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement (insertSQL)) {

            preparedStatement.setString (1, name);
            preparedStatement.setString (2, spec);
            int rowsAffected = preparedStatement.executeUpdate ( );
            System.out.println ("Doctor added successfully. Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            System.err.println ("SQL Error: " + e.getMessage ( ));
        }
    }


    // Method to display data with error handling
    void showValues (String dbname, String tablename) {
        String selectSQL = "SELECT * FROM " + tablename;
        try (Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
             Statement statement = connection.createStatement ( );
             ResultSet rs = statement.executeQuery (selectSQL)) {

            // Check if the result set contains any records
            if (!rs.isBeforeFirst ( )) {
                System.out.println ("No values in the table. Please insert values first.");
                return;
            }
            // Display the records
            System.out.println ("Records from table " + tablename + ":");
            while (rs.next ( )) {
                System.out.println ("ID: " + rs.getInt ("doc_id") +
                        ", Name: " + rs.getString ("doc_name") +
                        ", Speciality: " + rs.getString ("doc_speciality") +
                        ", Created At: " + rs.getTimestamp ("created_at"));
            }
        } catch (SQLException e) {
            System.err.println ("SQL Error: " + e.getMessage ( ));
        }
    }


    public void updateRecord (String dbname, String tableName, String newName, String newSpecialty, int docId) throws SQLException {
        String sql = "UPDATE " + tableName + " SET doc_name = ?, doc_speciality = ? WHERE doc_id = ?";
        Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement (sql);
        preparedStatement.setString (1, newName);
        preparedStatement.setString (2, newSpecialty);
        preparedStatement.setInt (3, docId);

        int rowsAffected = preparedStatement.executeUpdate ( );

        if (rowsAffected > 0) {
            System.out.println ("Updated record with ID: " + docId);
        } else {
            System.out.println ("No record found with ID: " + docId);
        }
    }

    public void alterTable (String dbname, String tableName, String newColumnName, String columnDefinition) throws SQLException {
        String sql = "ALTER TABLE " + tableName + " ADD " + newColumnName + " " + columnDefinition;
        Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement (sql);
        preparedStatement.executeUpdate ( );
        System.out.println ("Added column " + newColumnName + " to table " + tableName);
    }

    public void truncateTable (String dbname, String tableName) throws SQLException {
        String sql = "TRUNCATE TABLE " + tableName;
        Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement (sql);
        preparedStatement.executeUpdate ( );
        System.out.println ("Table " + tableName + " has been truncated.");
    }

    public void deleteAllRecords (String dbname, String tableName) throws SQLException {
        String sql = "DELETE FROM " + tableName;
        Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement (sql);
        int rowsAffected = preparedStatement.executeUpdate ( );
        System.out.println ("Deleted " + rowsAffected + " record(s) from " + tableName);
    }

    public void deleteSpecificRecord (String dbname, String tableName, int docId) throws SQLException {
        String sql = "DELETE FROM " + tableName + " WHERE doc_id = ?";
        Connection connection = DriverManager.getConnection (URL + dbname, USERNAME, PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement (sql);
        preparedStatement.setInt (1, docId);
        int rowsAffected = preparedStatement.executeUpdate ( );

        if (rowsAffected > 0) {
            System.out.println ("Deleted record with ID: " + docId + " from " + tableName);
        } else {
            System.out.println ("No record found with ID: " + docId);
        }
    }






}
