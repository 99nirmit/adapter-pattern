package com.pattern.adapter.model;

public class OldDatabase {

    void connectToDatabase(String connectionString){
        System.out.println("Connecting to the database with connection string: " + connectionString);
    }
}
