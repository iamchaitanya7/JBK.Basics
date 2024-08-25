package com.jbk.mock;

public class Account {
    double salary;
    String username = "Chaitanya";
    String password = "Chaitanya@123";

    void getSalary(double sal, String uName, String pwd){
        salary = sal;

        if(uName.equals(username) && pwd.equals(password)){
            System.out.printf ("Person's Salary is: " + salary);
        }
        else{
            System.out.printf ("Enter Valid Username and Password");
        }
    }


}
