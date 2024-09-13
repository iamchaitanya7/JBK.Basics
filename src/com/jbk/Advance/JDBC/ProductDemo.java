package com.jbk.Advance.JDBC;

public class ProductDemo {
    private int id;
    private String name;
    private double price;

    public ProductDemo (int id, String name, double price) {
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

    @Override
    public String toString () {
        return "ProductDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice (double price) {
        this.price = price;
    }
}
