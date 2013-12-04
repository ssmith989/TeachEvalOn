package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class TA1Q3Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q3);
        Button ta1q3Next = (Button) findViewById(R.id.ta1q3Next);
        ta1q3Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent ta1q4 = new Intent(getApplicationContext(), TA1Q4Activity.class);
        		startActivity(ta1q4);
        	}
        });
    }
}