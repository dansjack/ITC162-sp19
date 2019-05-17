package com.example.tipcalculator.database;

import android.provider.BaseColumns;

public final class ContractTipTable {

    private ContractTipTable() {}


    public static class TipTable implements BaseColumns {
        public static final String TABLE_NAME = "tip";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DATE = "bill_date";
        public static final String COLUMN_AMOUNT = "bill_amount";
        public static final String COLUMN_TIP = "tip_percent";
    }

    // Had to make this public in order to get it from DBHelper. Try to make private
    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TipTable.TABLE_NAME + " (" +
                    TipTable.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    TipTable.COLUMN_DATE + " INTEGER," +
                    TipTable.COLUMN_AMOUNT + " REAL," +
                    TipTable.COLUMN_TIP + " REAL)";


    // Had to make this public in order to get it from DBHelper. Try to make private
    public static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TipTable.TABLE_NAME;



}
