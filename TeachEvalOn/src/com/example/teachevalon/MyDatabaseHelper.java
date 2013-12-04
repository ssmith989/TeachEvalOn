package com.example.teachevalon;

import java.util.LinkedList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDatabaseHelper extends SQLiteOpenHelper{

	  private static final String Mdatabase = "TeacherScores.db";
	  private static final int databaseV = 1;
	  private static final String Table = "Info";
	  //private SQLiteDatabase myDataBase;
	  //private static String DB_PATH = "/data/data/com.example.teachevalon/databases/";
	
	  public static final String ID = "ID";
	  public static final String Teacher = "Teacher";
	  public static final String Answer1 = "Answer1";
	  public static final String Answer2 = "Answer2";
	  public static final String Answer3 = "Answer3";
	  public static final String Answer4 = "Answer4";
	  public static final String Answer5 = "Answer5";
	  public static final String Email = "email";
	  public static final String[] Columns = {ID,Teacher,Answer1,Answer2,
		  Answer3, Answer4,Answer5,Email};

	  // Database creation sql statement
	  private static final String databaseCreate = "create table "
	      + Table + "(" + ID + " primary key, " + Teacher 
	      + " text, " + Answer1 + " text, " + Answer2 +
	      " text, " + Answer3 + " text, " + Answer4 +
	      " text, " + Answer5 + " text, " + Email
	      + " text )";

	  public MyDatabaseHelper(Context context) {
	    super(context, Mdatabase, null, databaseV);
	  }

	  @Override
	  public void onCreate(SQLiteDatabase database) {
	    database.execSQL(databaseCreate);
	  }

	  
	  
	  
	  @Override
	  public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
	    Log.w(MyDatabaseHelper.class.getName(),
	        "Upgrading database from version " + oldVersion + " to "
	            + newVersion + ", which will destroy all old data");
	    database.execSQL("DROP TABLE IF EXISTS " + Mdatabase);
	    onCreate(database);
	  }
	  
	  
	  public void addSurvey(Table info) {
		    SQLiteDatabase db = this.getWritableDatabase();
		 
		    ContentValues values = new ContentValues();
		    values.put(Teacher, info.getName()); 
		    values.put(Answer1, info.getAnswer1());
		    values.put(Answer2, info.getAnswer2());
		    values.put(Answer3, info.getAnswer3());
		    values.put(Answer4, info.getAnswer4());
		    values.put(Answer5, info.getAnswer5());
		    values.put(Email, info.getEmail());
		 
		    // Inserting Row
		    db.insert(Table, null, values);
		    db.close(); // Closing database connection
		}
	  

	  /*public Table getContact(int id) {
		    SQLiteDatabase db = this.getReadableDatabase();
		 
		    //String result;
		    Table contact;
		    Cursor cursor = db.query(Table, new String[] { ID,
		            Teacher, Answer1, Answer2, Answer3,
		            Answer4, Answer5, Email}, ID + "=?",
		            new String[] { String.valueOf(id) }, null, null, null, null);
		    /*try {
                if (cursor.moveToFirst()) {
                    result = cursor.getString(0);
                }
                result = cursor.getString(0);
            } finally {
                cursor.close();
            }
		    return result;*/
		    /*try{
		    	if (cursor != null)
		    		cursor.moveToFirst();
		    	
		    	contact = new Table(Integer.parseInt(cursor.getString(0)),
		    			cursor.getString(1), cursor.getString(2), cursor.getString(3),
		    			cursor.getString(4), cursor.getString(5), cursor.getString(6),
		    			cursor.getString(7));
		    }
		    finally{
		    // return contact
		    cursor.close();
		    
		    }
		    return contact;
		}
	  */
	  /*public void open() throws SQLException {
		    String myPath = DB_PATH + Mdatabase;
	    	myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
	    	 }*/
	  
	  public List<Table> getAllSurveys() {
		    List<Table> infoList = new LinkedList<Table>();
		    // Select All Query
		    String selectQuery = "SELECT  * FROM " + Table;
		 
		    SQLiteDatabase db = this.getWritableDatabase();
		    Cursor cursor = db.rawQuery(selectQuery, null);
		 
		    // looping through all rows and adding to list
		    Table table = null;
		    if (cursor.moveToFirst()) {
		    	do{
		            table = new Table();
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
		    Log.d("getAllBooks()", infoList.toString());
		    // return contact list
		    return infoList;
		}
	  
	  public int updateSurvey(Table info) {
		    SQLiteDatabase db = this.getWritableDatabase();
		 
		    ContentValues values = new ContentValues();
		    values.put(Teacher, info.getName());
		    values.put(Answer1, info.getAnswer1());
		    values.put(Answer2, info.getAnswer2());
		    values.put(Answer3, info.getAnswer3());
		    values.put(Answer4, info.getAnswer4());
		    values.put(Answer5, info.getAnswer5());
		    values.put(Email, info.getEmail());
		 
		    // updating row
		    int num = db.update(Table, values, ID + " = ?",
		            new String[] { String.valueOf(info.getId()) });
		    
		    db.close();
		    return num;
		}

	  public void deleteBook(Table table) {
	        SQLiteDatabase db = this.getWritableDatabase();
	 
	        db.delete(Table,
	                ID+" = ?",
	                new String[] { String.valueOf(table.getId()) });
	 
	        // 3. close
	        db.close();
	  }
	 
	    
	  
}