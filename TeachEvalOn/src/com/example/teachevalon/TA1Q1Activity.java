package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class TA1Q1Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q1);
        Button ta1q1Next = (Button) findViewById(R.id.ta1q1Next);
        ta1q1Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent ta1q2 = new Intent(getApplicationContext(), TA1Q2Activity.class);
        		startActivity(ta1q2);
        	}
        });
    }
}