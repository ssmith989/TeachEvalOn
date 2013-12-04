package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class TA1EvalActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1eval);
        Button btnTa1Start = (Button) findViewById(R.id.btnTa1Start);
        btnTa1Start.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent t1q1 = new Intent(getApplicationContext(), TA1Q1Activity.class);
        		startActivity(t1q1);
        	}
        });
    }
}