package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class TA1Q3Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q3);
        r1 = (RadioButton) findViewById(R.id.vgta13);
        r2 = (RadioButton) findViewById(R.id.gta13);
        r3 = (RadioButton) findViewById(R.id.nta13);
        r4 = (RadioButton) findViewById(R.id.pta13);
        r5 = (RadioButton) findViewById(R.id.vpta13);
        Button ta1q3Next = (Button) findViewById(R.id.ta1q3Next);
        ta1q3Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			TA1EvalActivity.taq3="Very Good";
        		if(r2.isChecked()==true)
        			TA1EvalActivity.taq3="Good";
        		if(r3.isChecked()==true)
        			TA1EvalActivity.taq3="Nuetral";
        		if(r4.isChecked()==true)
        			TA1EvalActivity.taq3="Poor";
        		if(r5.isChecked()==true)
        			TA1EvalActivity.taq3="Very Poor";
        		Intent ta1q4 = new Intent(getApplicationContext(), TA1Q4Activity.class);
        		startActivity(ta1q4);
        	}
        });
    }
}