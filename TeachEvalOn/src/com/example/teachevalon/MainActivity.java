package com.example.teachevalon;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
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
