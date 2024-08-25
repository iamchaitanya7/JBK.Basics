package com.jbk.oops.constructor;

public class Test_No_Constructor_Ex {
    public static void main (String[] args) {
        //11-August-2024-Task
        //Drivers New Object Creation Program.

        No_Constructor_Ex d1 = new No_Constructor_Ex ();
        d1.id = 101;
        d1.name = "Chaitanya";
        d1.licno = "MH976708-2024";
        d1.age = 22;
        System.out.println ( d1.id + " " + d1.name + " " + d1.licno + " " + d1.age );

        No_Constructor_Ex d2 = new No_Constructor_Ex ();
        d2.id = 102;
        d2.name = "Pratik";
        d2.licno = "MH976708-2023";
        d2.age = 23;
        System.out.println ( d2.id + " " + d2.name + " " + d2.licno + " " + d2.age );

        No_Constructor_Ex d3 = new No_Constructor_Ex ();
        d3.id = 103;
        d3.name = "Akash";
        d3.licno = "MH976708-2022";
        d3.age = 24;
        System.out.println ( d3.id + " " + d3.name + " " + d3.licno + " " + d3.age );

        No_Constructor_Ex d4 = new No_Constructor_Ex ();
        d4.id = 104;
        d4.name = "Sanket";
        d4.licno = "MH976708-2021";
        d4.age = 25;
        System.out.println ( d4.id + " " + d4.name + " " + d4.licno + " " + d4.age );

        No_Constructor_Ex d5 = new No_Constructor_Ex ();
        d5.id = 105;
        d5.name = "Tejas";
        d5.licno = "MH976708-2020";
        d5.age = 26;
        System.out.println ( d5.id + " " + d5.name + " " + d5.licno + " " + d5.age );
    }
}
