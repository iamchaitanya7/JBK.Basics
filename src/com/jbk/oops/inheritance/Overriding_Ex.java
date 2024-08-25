package com.jbk.oops.inheritance;

public class Overriding_Ex {
    private int id;
    private String name;
    private double price;

    @Override
    public String toString(){
        return id + " " + name + " " + price;
    }

    public Overriding_Ex(){

    }

    public Overriding_Ex (int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}