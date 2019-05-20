package com.example.tipcalculator.database;

import androidx.room.RoomDatabase;


@androidx.room.Database(entities = {Tip.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract TipDao tipDao();
}
