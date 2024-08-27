package com.jbk.exception_handling.assignments;

class MyOwnExceptionEmployeeTest {

    static void employeeAge (int age) throws MyOwnException {
        if (age < 0) {
            throw new MyOwnException ("Age can't be less than zero");
        } else {
            System.out.println ("Input is valid!!");
        }
    }

    public static void main (String[] args) {
        try {
            employeeAge (-2);
        } catch (MyOwnException e) {
            e.printStackTrace ( );
        }
    }
}
