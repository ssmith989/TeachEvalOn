package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class TA1Q2Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q2);
        Button ta1q2Next = (Button) findViewById(R.id.ta1q2Next);
        ta1q2Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent ta1q3 = new Intent(getApplicationContext(), TA1Q3Activity.class);
        		startActivity(ta1q3);
        	}
        });
    }
}