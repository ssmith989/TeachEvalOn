package com.example.teachevalon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        MyDatabaseHelper db = new MyDatabaseHelper(this);
        
        Log.d("Insert: ", "Inserting .."); 
        db.addSurvey(new Table("Ravi", "A", "B", "C", "D", "F", "E"));        
        db.addSurvey(new Table("Srinivas", "A", "B", "C", "D", "F", "E")); 
        db.addSurvey(new Table("Tommy", "A", "B", "C", "D", "F", "E")); 
        db.addSurvey(new Table("Karthik", "A", "B", "C", "D", "F", "E")); 
         
        //Log.d("Reading: ", "Reading all contacts.."); 
        //db.getAllSurveys();
        
        Button exitButton = (Button) findViewById(R.id.exitButton);
        Button surveyButton = (Button) findViewById(R.id.surveyButton);
        surveyButton.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent surveyScreen = new Intent(getApplicationContext(), SurveysActivity.class);
        		startActivity(surveyScreen);
        	}
        });
        exitButton.setOnClickListener(new View.OnClickListener() {
        	@Override
        	public void onClick(View v){
        		finish();
        		System.exit(0);
        	}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
