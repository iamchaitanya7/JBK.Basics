package com.jbk.Advance.JDBC;

import com.jbk.basics.assignments.accessModifiers.jbk.A;
import com.jbk.file_handling.Product;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class TestProduct {
    void separator () {
        System.out.println ("============================================");
    }

    //Simple Program to Connect to the (MySQL 8.0.36) Database.
    public static void main (String[] args) throws ClassNotFoundException, SQLException {
        TestProduct line = new TestProduct ( );

        //Loading the jdbc.driver
        Class.forName ("com.mysql.cj.jdbc.Driver");
        line.separator ( );
        System.out.println ("Driver Class is Loaded....!");
        line.separator ( );

        // Url path should be as : jbbc driver name; ip address; port no; db name;
        String urlPath = "jdbc:mysql://localhost:3306/db1196";
        String userName = "root";
        String passWord = "Chaitanya@123";
        //Establishing the Connection with the Database.
        Connection connection = DriverManager.getConnection (urlPath, userName, passWord);
        if (connection == null) {
            System.out.println ("Could Not Establish Connection to Database....!");
        } else {
            System.out.println ("Connection is Established Successfully....!");
        }
        line.separator ( );

        //Query to be executed.
        String query = " select * from product";
        //Creation of Statement.
        Statement statement = connection.createStatement ( );
        //Storing the resultant query result into the ResultSet.
        ResultSet queryResult = statement.executeQuery (query);

        //Using the ArrayList to Retrieve the Upcoming Data.
        ArrayList<ProductDemo> productList = new ArrayList<> ( );
        while (queryResult.next ( )) {
            //Retrieving the Data using Constructor.
            /*ProductDemo product = new ProductDemo (queryResult.getInt ("id") ,queryResult.getString ("name"), queryResult.getDouble ("price"));
            System.out.println (product);*/

            productList.add (new ProductDemo (queryResult.getInt ("id"), queryResult.getString ("name"), queryResult.getDouble ("price")));

            //System.out.println (queryResult.getInt ("id") + " " + queryResult.getString ("name") + " " + queryResult.getDouble ("price"));
        }

        //Displaying the Gathered Result of Query into ArrayList.
        productList.forEach (p -> System.out.println (p));
        line.separator ( );
        //Closing the established connections
        queryResult.close ( );
        statement.close ( );
        connection.close ( );
    }
}
