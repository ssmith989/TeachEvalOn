package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class TA1Q4Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q4);
        r1 = (RadioButton) findViewById(R.id.vgta14);
        r2 = (RadioButton) findViewById(R.id.gta14);
        r3 = (RadioButton) findViewById(R.id.nta14);
        r4 = (RadioButton) findViewById(R.id.pta14);
        r5 = (RadioButton) findViewById(R.id.vpta14);
        Button ta1q4Next = (Button) findViewById(R.id.ta1q4Next);
        ta1q4Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			TA1EvalActivity.taq4="Very Good";
        		if(r2.isChecked()==true)
        			TA1EvalActivity.taq4="Good";
        		if(r3.isChecked()==true)
        			TA1EvalActivity.taq4="Nuetral";
        		if(r4.isChecked()==true)
        			TA1EvalActivity.taq4="Poor";
        		if(r5.isChecked()==true)
        			TA1EvalActivity.taq4="Very Poor";
        		Intent ta1q5 = new Intent(getApplicationContext(), TA1Q5Activity.class);
        		startActivity(ta1q5);
        	}
        });
    }
}