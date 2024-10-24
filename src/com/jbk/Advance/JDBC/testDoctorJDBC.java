package com.jbk.Advance.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class testDoctorJDBC {
    static void displayMenu () throws SQLException {
        Scanner sc = new Scanner (System.in);
        doctorJDBC doc = new doctorJDBC ( );
        String dbName, tableName, docName, docSpecialty;
        dbName = "doctorJBK";
        tableName = "doctorRecords";

        while (true) {
            System.out.println ("======================================================");
            System.out.println ("|               DOCTOR DATABASE SYSTEM               |");
            System.out.println ("======================================================");
            System.out.println ("| 1.  ➤ Create a New Database                        |");
            System.out.println ("| 2.  ➤ Create a New Table                           |");
            System.out.println ("| 3.  ➤ Insert Data into Table                       |");
            System.out.println ("| 4.  ➤ Display Table Info                           |");
            System.out.println ("| 5.  ➤ Display Specific Table Info                  |");
            System.out.println ("| 6.  ➤ Update Specific Table Info                   |");
            System.out.println ("| 7.  ➤ Alter a Existing Table                       |");
            System.out.println ("| 8.  ➤ Truncate Table Info                          |");
            System.out.println ("| 9.  ➤ Delete All Table Info                        |");
            System.out.println ("| 10. ➤ Delete Specific Table Info                  |");
            System.out.println ("| 11. ➤ Exit                                        |");
            System.out.println ("======================================================");
            System.out.print ("| Please Enter Your Choice ➤ ");

            int choice = sc.nextInt ( );
            switch (choice) {
                case 1:
                    doc.createDatabase (dbName);
                    break;

                case 2:
                    doc.createTable (dbName, tableName);
                    break;

                case 3:
                    System.out.print ("Enter Doctor's name: ");
                    docName = sc.next ( );
                    System.out.print ("Enter Doctor's specialty: ");
                    docSpecialty = sc.next ( );
                    doc.insertValues (dbName, tableName, docName, docSpecialty);
                    break;

                case 5:
                    doc.showValues (dbName, tableName);
                    break;

                case 6:
                    doc.showData (dbName, tableName);
                    break;

                case 7:
                    doc.showData (dbName, tableName);
                    break;

                case 8:
                    doc.showData (dbName, tableName);
                    break;

                case 9:
                    doc.showData (dbName, tableName);
                    break;

                case 10:
                    doc.showData (dbName, tableName);
                    break;

                case 11:
                    System.out.println ("Exiting...");
                    sc.close ( );
                    System.exit (0);
                    break;

                default:
                    System.out.println ("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    public static void main (String[] args) throws SQLException {
        testDoctorJDBC.displayMenu ( );
    }
}
