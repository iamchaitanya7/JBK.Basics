package com.jbk.oops.inheritance;

public class Method_Overloading {
    int add(int a, int b){
        return a + b;
    }
    float add(float a, float b){
        return a + b;
    }
    float add(int a, float b){
        return a + b;
    }
    float add(float a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main (String[] args) {
        Method_Overloading obj = new Method_Overloading ();
        int res1 = obj.add (10, 20);
        System.out.println (res1);
        float res2 = obj.add (10.5f, 20.5f);
        System.out.println (res2);
        float res3 = obj.add (10.5f, 20);
        System.out.println (res3);
        float res4 = obj.add(10, 20.5f);
        System.out.println (res4);
        int res5 =obj.add(10, 20, 30);
        System.out.println (res5);



    }
}
