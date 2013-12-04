package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class TA1Q2Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q2);
        r1 = (RadioButton) findViewById(R.id.vgta12);
        r2 = (RadioButton) findViewById(R.id.gta12);
        r3 = (RadioButton) findViewById(R.id.nta12);
        r4 = (RadioButton) findViewById(R.id.pta12);
        r5 = (RadioButton) findViewById(R.id.vpta12);
        Button ta1q2Next = (Button) findViewById(R.id.ta1q2Next);
        ta1q2Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			TA1EvalActivity.taq2="Very Good";
        		if(r2.isChecked()==true)
        			TA1EvalActivity.taq2="Good";
        		if(r3.isChecked()==true)
        			TA1EvalActivity.taq2="Nuetral";
        		if(r4.isChecked()==true)
        			TA1EvalActivity.taq2="Poor";
        		if(r5.isChecked()==true)
        			TA1EvalActivity.taq2="Very Poor";
        		Intent ta1q3 = new Intent(getApplicationContext(), TA1Q3Activity.class);
        		startActivity(ta1q3);
        	}
        });
    }
}