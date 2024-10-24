package com.jbk.Advance.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class testUserApp {
    static void displayMenu () throws SQLException {
        Scanner scanner = new Scanner (System.in);
        UserApp login = new UserApp ( );
        String dbName = "JBKUsers";
        String tableName = "Users";
        login.createDatabase (dbName);
        login.createTable (dbName, tableName);

        int choice;
        while (true) {
            System.out.println ("=================================");
            System.out.println ("|        USER APP               |");
            System.out.println ("=============================== =");
            System.out.println ("| 1.  ➤ SIGN UP                |");
            System.out.println ("| 2.  ➤ SHOW ALL USERS         |");
            System.out.println ("| 3.  ➤ LOGIN                  |");
            System.out.println ("| 4.  ➤ EXIT                   |");
            System.out.println ("=================================");
            System.out.print (" | Please Enter Your Choice ➤ ");
            choice = scanner.nextInt ( );
            scanner.nextLine ( ); // Consume newline

            switch (choice) {
                case 1:
                    login.signUp (dbName, tableName);
                    break;
                case 2:
                    login.showUsers (dbName, tableName);
                    break;
                case 3:
                    login.loginUser (dbName, tableName);
                    break;
                case 4:
                    System.out.println ("Exiting...");
                    break;
                default:
                    System.out.println ("Invalid choice! Please try again.");
            }
        }
    }

    public static void main (String[] args) throws SQLException {
        testUserApp.displayMenu ( );
    }
}


