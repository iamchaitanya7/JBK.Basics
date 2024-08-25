package com.jbk.oops.abstraction.assignments;

public class AssignmentNo_3_Child2_C extends AssignmentNo_3_Child1_C{
    String name, gender, city, country;

    @Override
    void getName(String name){
        this.name = name;
    }

    @Override
    void getGender(String gender){
        this.gender = gender;
    }

    @Override
    void getCity(String city){
        this.city = city;
    }

    @Override
    void getCountry(String country){
        this.country = country;
    }

    //Concrete Method of Child Class 2
    void display(){
        System.out.println ( "Name: " +name );
        System.out.println ( "Gender: " +gender );
        System.out.println ( "City: " +city );
        System.out.println ( "Country: " +country );
    }
}
