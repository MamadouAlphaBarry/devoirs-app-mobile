package com.sid.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DBConnection db = new DBConnection(this);
        db.insertNewStudent("MAMADOU ALPHA","Barry","test@gmail.com",20);
        setContentView(R.layout.activity_main);
    }
}