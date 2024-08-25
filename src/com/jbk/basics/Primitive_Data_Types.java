package com.jbk.basics;

public class Primitive_Data_Types {
    public static void main (String[] args) {
        //Primitive Data Types
        byte a = 1;             //Size = 1 Bytes (08 Bits); Default Value = 0; Range (-128 to 127)
        short b = 2;            //Size = 2 Bytes (16 Bits); Default Value = 0; Range (-32,768 to 32,767)
        int c = 10;             //Size = 4 Bytes (32 Bits); Default Value = 0; Range (-2,147,483,648 to 2,147,483,647)
        long d = 999999;        //Size = 8 Bytes (64 Bits); Default Value = 0; Range (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float e = 3.14f;        //Size = 4 Bytes (32 Bits); Default Value = 0.0; Range (upto 7 decimal points)
        double f = 22.12;       //Size = 8 Bytes (64 Bits); Default Value = 0.0; Range (upto 16 decimal points)
        char g = '@';           //Size = 2 Bytes (16 Bits); Default Value = \u0000 (Blank Space); Range (characters representation of ASCII values. 0 to 255)
        boolean h = true;       //Size = 1 Bytes (08 Bits); Default Value = false; Range (true, false)

        //Non-Primitive Data Types
        String st = "Hello World";
        int [] arr = {1, 2, 3, 4, 5};

        //Displaying the Values in DataTypes.
        System.out.println ("Byte: " +a);
        System.out.println ("Short: " +b);
        System.out.println ("Int: " +c);
        System.out.println ("Long: " +d);
        System.out.println ("Float: " +e);
        System.out.println ("Double: " +f);
        System.out.println ("Char: " +g);
        System.out.println ("Boolean: " +h);
        System.out.println ("String: " +st);
        System.out.println ("Array: " +arr[1]);
    }
}