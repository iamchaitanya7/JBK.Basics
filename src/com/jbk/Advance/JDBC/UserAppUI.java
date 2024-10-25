package com.jbk.Advance.JDBC;

import com.jbk.Advance.JDBC.UserApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UserAppUI {

    /*// Create instance of UserApp class
    UserApp userApp = new UserApp();
    String dbName = "JBKUsers";
    String tableName = "Users";

    public UserAppUI() throws SQLException {
        // Initialize Database and Table
        userApp.createDatabase(dbName);
        userApp.createTable(dbName, tableName);

        // Create the frame
        JFrame frame = new JFrame("User Application");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1)); // Set layout for buttons

        // Create Buttons
        JButton signUpButton = new JButton("Sign Up");
        JButton showUsersButton = new JButton("Show Users");
        JButton loginButton = new JButton("Login");
        JButton exitButton = new JButton("Exit");

        // Add action listeners to buttons
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSignUpDialog();
            }
        });

        showUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAllUsers();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginDialog();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add buttons to frame
        frame.add(signUpButton);
        frame.add(showUsersButton);
        frame.add(loginButton);
        frame.add(exitButton);

        // Set frame to visible
        frame.setVisible(true);
    }

    // Function to show Sign Up dialog
    private void showSignUpDialog() {
        // Create a new dialog for sign up
        JDialog signUpDialog = new JDialog();
        signUpDialog.setTitle("Sign Up");
        signUpDialog.setSize(300, 200);
        signUpDialog.setLayout(new GridLayout(4, 2));

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // Create a button for sign up
        JButton signUpButton = new JButton("Sign Up");

        // Add action listener for sign-up button
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (!name.isEmpty() && !username.isEmpty() && !password.isEmpty()) {
                    userApp.signUp(dbName, tableName); // Pass UI inputs
                    JOptionPane.showMessageDialog(signUpDialog, "Sign Up Successful!");
                    signUpDialog.dispose(); // Close dialog after sign up
                } else {
                    JOptionPane.showMessageDialog(signUpDialog, "Please fill all fields.");
                }
            }
        });

        // Add components to the dialog
        signUpDialog.add(nameLabel);
        signUpDialog.add(nameField);
        signUpDialog.add(usernameLabel);
        signUpDialog.add(usernameField);
        signUpDialog.add(passwordLabel);
        signUpDialog.add(passwordField);
        signUpDialog.add(new JLabel()); // Empty label for spacing
        signUpDialog.add(signUpButton);

        // Make the dialog visible
        signUpDialog.setVisible(true);
    }

    // Function to display all users
    private void showAllUsers() {
        JTextArea userListArea = new JTextArea(10, 30);
        userListArea.setEditable(false);

        // Fetch and display all users in a dialog
        String userData = userApp.showUsers(dbName, tableName); // Fetch user data as string
        userListArea.setText(userData);

        // Display the users in a scrollable text area inside a dialog
        JScrollPane scrollPane = new JScrollPane(userListArea);
        JOptionPane.showMessageDialog(null, scrollPane, "All Users", JOptionPane.INFORMATION_MESSAGE);
    }

    // Function to show Login dialog
    private void showLoginDialog() {
        // Create a new dialog for login
        JDialog loginDialog = new JDialog();
        loginDialog.setTitle("Login");
        loginDialog.setSize(300, 150);
        loginDialog.setLayout(new GridLayout(3, 2));

        // Create labels and text fields
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // Create a button for login
        JButton loginButton = new JButton("Login");

        // Add action listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                try {
                    userApp.loginUser(dbName, tableName); // Pass UI inputs
                    if (loginSuccess) {
                        JOptionPane.showMessageDialog(loginDialog, "Login Successful!");
                        loginDialog.dispose(); // Close dialog on successful login
                    } else {
                        JOptionPane.showMessageDialog(loginDialog, "Invalid Username or Password!");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(loginDialog, "Error during login: " + ex.getMessage());
                }
            }
        });

        // Add components to the dialog
        loginDialog.add(usernameLabel);
        loginDialog.add(usernameField);
        loginDialog.add(passwordLabel);
        loginDialog.add(passwordField);
        loginDialog.add(new JLabel()); // Empty label for spacing
        loginDialog.add(loginButton);

        // Make the dialog visible
        loginDialog.setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
        // Launch the UserAppUI
        new UserAppUI();
    }*/
}
