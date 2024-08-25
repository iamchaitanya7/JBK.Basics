package com.jbk.oops.abstraction;

//Concrete Class
public class B_Abstract_Ex extends A_Abstract_Ex{
    
    //Overrriding the "Abstract Method-1" of "Class A".
    @Override
    void A_Abstract_Ex(){
        System.out.println ("Overridden Abstract Class A's Abstract Method ");
    }


    //Overrriding the "Abstract Method-2" of "Class A".
    @Override
    void A_Abstract_Ex(int b){
        System.out.println ("Overridden Abstract Class A's Abstract Method: " + b);
    }

    //Overrriding the "Concrete Method" of "Class A".
    @Override
    void A_Abstract_Ex(String name){
        System.out.println ("Overridden Abstract Class A's Concrete Method:  " + name);
    }
}