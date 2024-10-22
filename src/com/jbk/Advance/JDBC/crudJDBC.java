package com.jbk.Advance.JDBC;

import java.sql.*;
import java.util.Scanner;

public class crudJDBC {
    static final String URL = "jdbc:mysql://localhost:3306/dbjdbc";
    static final String USERNAME = "root";
    static final String PASSWORD = "Chaitanya@123";

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println ("======================================================");
            System.out.println ("|               EMPLOYEE DATABASE SYSTEM             |");
            System.out.println ("======================================================");
            System.out.println ("| 1. ➤ Insert a New Employee                         |");
            System.out.println ("| 2. ➤ Display All Employees                         |");
            System.out.println ("| 3. ➤ Display Specific Employee                     |");
            System.out.println ("| 4. ➤ Update an Employee's Details                  |");
            System.out.println ("| 5. ➤ Delete an Employee                            |");
            System.out.println ("| 6. ➤ Exit                                          |");
            System.out.println ("======================================================");
            System.out.print ("| Please Enter Your Choice ➤ ");
            int choice = scanner.nextInt ( );

            switch (choice) {
                case 1:
                    insertEmployee ( );
                    break;
                case 2:
                    displayEmployees ( );
                    break;
                case 3:
                    displaySpecificEmployee ( );
                    break;
                case 4:
                    updateEmployee ( );
                    break;
                case 5:
                    deleteEmployee ( );
                    break;
                case 6:
                    System.out.println ("Exiting...");
                    scanner.close ( );
                    System.exit (0);
                default:
                    System.out.println ("Invalid choice. Please try again.");
            }
        }
    }

    // Method to insert an employee
    public static void insertEmployee () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("| Enter Employee ID: ➤");
        int id = scanner.nextInt ( );
        scanner.nextLine ( ); // Consume the newline character
        System.out.println ("| Enter Employee Name: ➤");
        String name = scanner.nextLine ( );
        System.out.println ("| Enter Employee Department: ➤");
        String empDept = scanner.nextLine ( );
        System.out.println ("| Enter Employee Salary: ➤");
        double salary = scanner.nextDouble ( );


        String insertSQL = "INSERT INTO crudemployees (emp_id, emp_name, emp_dept, emp_salary) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement (insertSQL)) {
            preparedStatement.setInt (1, id);
            preparedStatement.setString (2, name);
            preparedStatement.setString (3, empDept);
            preparedStatement.setDouble (4, salary);
            int rowsAffected = preparedStatement.executeUpdate ( );
            System.out.println ("| Employee added successfully. Rows affected: ➤ " + rowsAffected);
        } catch (SQLException e) {
            System.out.println ("SQL Error: " + e.getMessage ( ));
        }
    }

    //Method to display all employees
    public static void displayEmployees () {
        String selectSQL = "SELECT * FROM crudemployees";
        try (Connection connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery (selectSQL)) {
            System.out.println ("\n--- All Employee Records ---");
            while (resultSet.next ( )) {
                int id = resultSet.getInt ("emp_id");
                String name = resultSet.getString ("emp_name");
                String empDept = resultSet.getString ("emp_dept");
                double salary = resultSet.getDouble ("emp_salary");

                System.out.println ("ID: " + id + ", Name: " + name + ", Department: " + empDept + ", Salary: " + salary);
            }
        } catch (SQLException e) {
            System.out.println ("SQL Error: " + e.getMessage ( ));
        }
    }

    //Method to display all employees
    public static void displaySpecificEmployee () {
        String selectSQL = "SELECT * FROM crudemployees WHERE emp_id = ?";
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter Employee ID:");
        int emp_id = scanner.nextInt ( );
        try (Connection connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement (selectSQL)) {

            preparedStatement.setInt (1, emp_id);
            ResultSet resultSet = preparedStatement.executeQuery ( );
            System.out.println ("--- Specific Employee Records ---");
            while (resultSet.next ( )) {
                int id = resultSet.getInt ("emp_id");
                String name = resultSet.getString ("emp_name");
                String empDept = resultSet.getString ("emp_dept");
                double salary = resultSet.getDouble ("emp_salary");
                System.out.println ("ID: " + id + ", Name: " + name + ", Department: " + empDept + ", Salary: " + salary);
            }
        } catch (SQLException e) {
            System.out.println ("SQL Error: " + e.getMessage ( ));
        }
    }


    //Method to update an employee's details.
    public static void updateEmployee () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter Employee ID to update:");
        int id = scanner.nextInt ( );
        scanner.nextLine ( ); // Consume the newline character
        System.out.println ("Enter new Employee Name:");
        String name = scanner.nextLine ( );
        System.out.println ("Enter new Employee Department:");
        String dept = scanner.nextLine ( );
        System.out.println ("Enter new Employee Salary:");
        double salary = scanner.nextDouble ( );

        String updateSQL = "UPDATE crudemployees SET emp_name = ?, emp_dept = ?, emp_salary = ? WHERE emp_id = ?";
        try (Connection connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement (updateSQL)) {
            preparedStatement.setString (1, name);
            preparedStatement.setString (2, dept);
            preparedStatement.setDouble (3, salary);
            preparedStatement.setInt (4, id);
            int rowsAffected = preparedStatement.executeUpdate ( );
            if (rowsAffected > 0) {
                System.out.println ("Employee updated successfully. Rows Affected: ➤ " + rowsAffected);
            } else {
                System.out.println ("Employee with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println ("SQL Error: " + e.getMessage ( ));
        }
    }

    //Method to delete an employee.
    public static void deleteEmployee () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter Employee ID to delete:");
        int id = scanner.nextInt ( );

        String deleteSQL = "DELETE FROM crudemployees WHERE emp_id = ?";
        try (Connection connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement (deleteSQL)) {
            preparedStatement.setInt (1, id);
            int rowsAffected = preparedStatement.executeUpdate ( );
            if (rowsAffected > 0) {
                System.out.println ("Employee deleted successfully. Rows affected: ➤ " + rowsAffected);
            } else {
                System.out.println ("Employee with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println ("SQL Error: " + e.getMessage ( ));
        }
    }
}
