package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class TA1Q1Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q1);
        r1 = (RadioButton) findViewById(R.id.vgta11);
        r2 = (RadioButton) findViewById(R.id.gta11);
        r3 = (RadioButton) findViewById(R.id.nta11);
        r4 = (RadioButton) findViewById(R.id.pta11);
        r5 = (RadioButton) findViewById(R.id.vpta11);
        Button ta1q1Next = (Button) findViewById(R.id.ta1q1Next);
        ta1q1Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			TA1EvalActivity.taq1="Very Good";
        		if(r2.isChecked()==true)
        			TA1EvalActivity.taq1="Good";
        		if(r3.isChecked()==true)
        			TA1EvalActivity.taq1="Nuetral";
        		if(r4.isChecked()==true)
        			TA1EvalActivity.taq1="Poor";
        		if(r5.isChecked()==true)
        			TA1EvalActivity.taq1="Very Poor";
        		Intent ta1q2 = new Intent(getApplicationContext(), TA1Q2Activity.class);
        		startActivity(ta1q2);
        	}
        });
    }
}