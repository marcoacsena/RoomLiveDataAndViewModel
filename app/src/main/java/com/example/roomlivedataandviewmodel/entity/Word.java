package com.example.roomlivedataandviewmodel.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;

//It is not necessary define the tableName property
@Entity(tableName = "word_table")
public class Word {
    private String mWord;

    public Word(@NonNull String mWord) {this.mWord = mWord;}

    public String getmWord() {
        return mWord;
    }
}
