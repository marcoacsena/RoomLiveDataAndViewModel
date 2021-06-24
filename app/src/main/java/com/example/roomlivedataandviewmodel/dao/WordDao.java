package com.example.roomlivedataandviewmodel.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomlivedataandviewmodel.entity.Word;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void inset (Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * FROM word_table ORDER BY word asc")
    LiveData<List<Word>> getAllWords();
}
