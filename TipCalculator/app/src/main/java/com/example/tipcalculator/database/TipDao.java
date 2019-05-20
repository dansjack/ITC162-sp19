package com.example.tipcalculator.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface TipDao {
    @Query("SELECT * FROM tip")
    LiveData<List<Tip>> getTips();

    //@Query("SELECT * FROM tip WHERE _id IN (:tipIds)")
    //List<Tip> loadAllByIds(int[] tipIds);

    @Insert
    void insert(Tip tip);

    @Insert
    void insertAll(Tip... tips);

    @Delete
    void delete(Tip tips);
}
