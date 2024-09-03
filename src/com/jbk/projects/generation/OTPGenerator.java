package com.jbk.projects.generation;

import java.util.*;

public class OTPGenerator {

    // Method to generate a random 6-digit OTP
    public static String generateOTP () {
        Random random = new Random ( );
        int otp = 100000 + random.nextInt (900000); // Generates a 6-digit number
        return String.valueOf (otp);
    }

    // Method to validate the entered OTP with the generated OTP
    public static boolean validateOTP (String generatedOTP, String enteredOTP) {
        return generatedOTP.equals (enteredOTP);
    }

    public static void main (String[] args) {
        // Generate and display OTP
        String generatedOTP = generateOTP ( );
        System.out.println ("Your OTP is: " + generatedOTP);

        // Get OTP input from the user
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the OTP: ");
        String enteredOTP = scanner.nextLine ( );

        // Validate the entered OTP
        if (validateOTP (generatedOTP, enteredOTP)) {
            System.out.println ("Login Successful!");
        } else {
            System.out.println ("Invalid OTP. Please try again.");
        }

        scanner.close ( );
    }
}
