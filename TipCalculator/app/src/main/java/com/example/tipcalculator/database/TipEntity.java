package com.example.tipcalculator.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TipEntity {

    @PrimaryKey(autoGenerate = true)
    public Integer _id;

    public Integer bill_date;
    public Double bill_amount;
    public Double tip_percent;

}
