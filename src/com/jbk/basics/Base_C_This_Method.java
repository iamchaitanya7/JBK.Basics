package com.jbk.basics;

public class Base_C_This_Method {
    //08-August-2024-Task
    //Demostration of Calling of Local Methods using [this.method_name(default/parameters)] keyword by just calling a single last method.

    int id;

    void init(int id){
        this.id = id;
        System.out.println (id);
    }

    void display(){
        System.out.println (id);
    }

    void m1(int a){
        System.out.println ( "Integer Method" );
    }
    void m2(float b){
        this.m1 (10);
        System.out.println ( "Float Method" );
    }
    void m3(String c){
        this.m2 (3.14f);
        System.out.println ( "String Method" );
    }
    void m4(double d){
        this.m3 ("Hello");
        System.out.println ( "Double Method" );
    }
    void m5(char e){
        this.m4 (11.1);
        System.out.println ( "Char Method" );
    }
    void m6(boolean f){
        this.m5 ('*');
        System.out.println ( "Boolean Method" );
    }
}
