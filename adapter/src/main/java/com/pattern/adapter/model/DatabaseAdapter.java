package com.pattern.adapter.model;

public class DatabaseAdapter implements NewDatabase{

    private OldDatabase oldDatabase;

    public DatabaseAdapter(OldDatabase oldDatabase){
        this.oldDatabase =  oldDatabase;
    }

    @Override
    public void connect(String connectionString) {
        oldDatabase.connectToDatabase(connectionString);
    }
}
