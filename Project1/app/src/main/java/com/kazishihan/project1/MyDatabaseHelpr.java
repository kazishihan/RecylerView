package com.kazishihan.project1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelpr extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="Expense_DB";
    private static final String TABLE_NAME="Expense_Table";
    private static final int VERSION_NUMBER=1;
    private static final String ID =_id;
    private static final String EXPENSE_TYPE=Expense_type;
    private static final String EXPENSE_AMOUNT=Expense_amount;
    private static final String EXPENSE_DATE=Expense_date;
    private static final String EXPENSE_TIME=Expense_time;

    public MyDatabaseHelpr(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE Expense_Table()");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
