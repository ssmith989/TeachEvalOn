package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class ProfEvalActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profeval);
        Button btnProfStart = (Button) findViewById(R.id.btnProfStart);
        btnProfStart.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent pq1 = new Intent(getApplicationContext(), ProfQ1Activity.class);
        		startActivity(pq1);
        	}
        });
    }
}