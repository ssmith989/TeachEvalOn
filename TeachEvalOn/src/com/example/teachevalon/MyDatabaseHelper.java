package com.example.teachevalon;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper{

	//Declares names for database name,version, and also the name for the table.
	private static final String MDATABASE = "TeacherSURVEYS.db";
	private static final int DATABASEV = 1;
	private static final String TABLE = "Info";
	
	//declares the names of the columns:
	//ID, the answers to the surveys, and email.
	public static final String ID = "ID";
	public static final String TEACHER = "Teacher";
	public static final String ANSWER1 = "Answer1";
	public static final String ANSWER2 = "Answer2";
	public static final String ANSWER3 = "Answer3";
	public static final String ANSWER4 = "Answer4";
	public static final String ANSWER5 = "Answer5";
	public static final String EMAIL = "email";
	public static final String[] COLUMNS = {ID,TEACHER,ANSWER1,ANSWER2,
		ANSWER3, ANSWER4,ANSWER5,EMAIL};

	public MyDatabaseHelper(Context context) {
		super(context, MDATABASE, null, DATABASEV);
	}

	//creates the table
	@Override
	public void onCreate(SQLiteDatabase database) {
		String databaseCreate = "CREATE TABLE "
				+ TABLE + "(" + ID + " INTEGER PRIMARY KEY, " + TEACHER 
				+ " TEXT, " + ANSWER1 + " TEXT, " + ANSWER2 +
				" TEXT, " + ANSWER3 + " TEXT, " + ANSWER4 +
				" TEXT, " + ANSWER5 + " TEXT, " + EMAIL
				+ " TEXT )";
		database.execSQL(databaseCreate);
	}
	
	//gets rid of old tables and gets new ones.
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		database.execSQL("DROP TABLE IF EXISTS " + TABLE);
		this.onCreate(database);
	}
	
	//adds an element to the database.
	public void addSurvey(Table table) {
		SQLiteDatabase db = this.getWritableDatabase();
		
		//puts the contents into the table.
		ContentValues values = new ContentValues();
		values.put(TEACHER, table.getName()); 
		values.put(ANSWER1, table.getAnswer1());
		values.put(ANSWER2, table.getAnswer2());
		values.put(ANSWER3, table.getAnswer3());
		values.put(ANSWER4, table.getAnswer4());
		values.put(ANSWER5, table.getAnswer5());
		values.put(EMAIL, table.getEmail());
		
		//inserting Row
		db.insert(TABLE, null, values);
		db.close();
	}
	
	//finds a specific ID
	public Table getTeacher(int id) {
		SQLiteDatabase db = this.getReadableDatabase();
		
		Cursor cursor = db.query(TABLE, COLUMNS,  ID + "=?",
				new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null){
			cursor.moveToFirst();
		}
		
		Table table = new Table();
		
		table.setId(Integer.parseInt(cursor.getString(0)));
		table.setName(cursor.getString(1));
		table.setAnswer1(cursor.getString(2));
		table.setAnswer2(cursor.getString(3));
		table.setAnswer3(cursor.getString(4));
		table.setAnswer4(cursor.getString(5));
		table.setAnswer5(cursor.getString(6));
		table.setEmail(cursor.getString(7));
		
		return table;
	}
	
	//iterates through the table
	public List<Table> getAllSurveys() {
		List<Table> infoList = new ArrayList<Table>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE;
		
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do{
				Table table = new Table();
				table.setId(Integer.parseInt(cursor.getString(0)));
				table.setName(cursor.getString(1));
				table.setAnswer1(cursor.getString(2));
				table.setAnswer2(cursor.getString(3));
				table.setAnswer3(cursor.getString(4));
				table.setAnswer4(cursor.getString(5));
				table.setAnswer5(cursor.getString(6));
				table.setEmail(cursor.getString(7));
				// Adding contact to list
				infoList.add(table);
			}while (cursor.moveToNext());
			
		}
		// return contact list
		return infoList;
	}
	
	//updates table
	public int updateSurvey(Table table) {
		SQLiteDatabase db = this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put(TEACHER, table.getName());
		values.put(ANSWER1, table.getAnswer1());
		values.put(ANSWER2, table.getAnswer2());
		values.put(ANSWER3, table.getAnswer3());
		values.put(ANSWER4, table.getAnswer4());
		values.put(ANSWER5, table.getAnswer5());
		values.put(EMAIL, table.getEmail());
		
		// updating row
		int num = db.update(TABLE, values, ID + " = ?",
				new String[] { String.valueOf(table.getId()) });
		
		db.close();
		return num;
	}
	
	//deletes a row in the table
	public void deleteTeacher(Table table) {
		SQLiteDatabase db = this.getWritableDatabase();
		
		db.delete(TABLE, ID + " = ?",
				new String[] { String.valueOf(table.getId()) });
		
		// 3. close
		db.close();
	}
	
}