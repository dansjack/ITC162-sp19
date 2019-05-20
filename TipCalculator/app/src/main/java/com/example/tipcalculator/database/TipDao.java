package com.example.tipcalculator.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TipDao {
    @Query("SELECT * FROM tip")
    List<Tip> getAll();

    @Query("SELECT * FROM tip WHERE _id IN (:_id)")
    List<Tip> loadAllByIds(int[] _id);

    @Insert
    void insertAll(Tip... tips);

    @Delete
    void delete(Tip tips);
}
