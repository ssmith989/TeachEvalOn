package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;


public class TA1EvalActivity extends Activity{
	public static String taNameStore;
	public static String taq1;
	public static String taq2;
	public static String taq3;
	public static String taq4;
	public static String taq5;
	EditText taName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1eval);
        
        taName = (EditText) findViewById(R.id.ta1Name);
        Button btnTa1Start = (Button) findViewById(R.id.btnTa1Start);
        btnTa1Start.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		taNameStore = taName.getText().toString();
        		Intent t1q1 = new Intent(getApplicationContext(), TA1Q1Activity.class);
        		startActivity(t1q1);
        	}
        });
    }
}