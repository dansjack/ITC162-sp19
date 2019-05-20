package com.example.roomwordsample;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao()
public interface WordDao {

    @Insert
    void insert(Word word);

    @Delete
    void deleteAll();


    // change the getAllWords() method signature so that
    // the returned List<Word> is wrapped with LiveData.
    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}
