package com.sid.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBConnection extends SQLiteOpenHelper {
    public DBConnection(@Nullable Context context) {
        super(context, "Student.db", null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Student(ID INTEGER PRIMARY KEY, NAME TEXT, FIRSTNAME TEXT, EMAIL TEXT,AGE INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertNewStudent(String name,String firstname,String email,Integer age){
        SQLiteDatabase swd= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("FIRSTNAME",firstname);
        contentValues.put("EMAIL",email);
        contentValues.put("AGE",age);
        swd.insert("Student",null,contentValues);

    }
    public  void deleteRow(Integer id){
        SQLiteDatabase swd= this.getWritableDatabase();
    }
}
