package com.jbk.Advance.JDBC;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.sql.*;

public class retrieveDBImage {
    public static void main (String[] args) throws ClassNotFoundException {
        Class.forName ("com.mysql.cj.jdbc.Driver");

        // Database credentials and connection details
        String url = "jdbc:mysql://localhost:3306/db951";
        String user = "root";
        String password = "Chaitanya@123";

        // JDBC connection
        try (Connection connection = DriverManager.getConnection (url, user, password)) {
            String query = "SELECT file_name, file_data FROM files WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement (query);

            // Set the ID of the image you want to retrieve
            int fileId = 1; // Change this to the actual file ID
            statement.setInt (1, fileId);

            ResultSet resultSet = statement.executeQuery ( );

            if (resultSet.next ( )) {
                String fileName = resultSet.getString ("file_name");
                byte[] fileData = resultSet.getBytes ("file_data");

                // Convert byte array into an ImageIcon
                ImageIcon imageIcon = new ImageIcon (fileData);

                // Display the image in a JFrame
                JFrame frame = new JFrame ("Image Display: " + fileName);
                JLabel label = new JLabel (imageIcon);
                frame.getContentPane ( ).add (label, BorderLayout.CENTER);
                frame.setSize (imageIcon.getIconWidth ( ), imageIcon.getIconHeight ( ));
                frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                frame.setVisible (true);
            } else {
                System.out.println ("No image found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
    }
}
