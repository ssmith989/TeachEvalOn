package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class ProfQ3Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq3);
        Button pq3Next = (Button) findViewById(R.id.pq3Next);
        r1 = (RadioButton) findViewById(R.id.vgp3);
        r2 = (RadioButton) findViewById(R.id.gp3);
        r3 = (RadioButton) findViewById(R.id.np3);
        r4 = (RadioButton) findViewById(R.id.pp3);
        r5 = (RadioButton) findViewById(R.id.vpp3);
        pq3Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			ProfEvalActivity.prfq3="Very Good";
        		if(r2.isChecked()==true)
        			ProfEvalActivity.prfq3="Good";
        		if(r3.isChecked()==true)
        			ProfEvalActivity.prfq3="Nuetral";
        		if(r4.isChecked()==true)
        			ProfEvalActivity.prfq3="Poor";
        		if(r5.isChecked()==true)
        			ProfEvalActivity.prfq3="Very Poor";
        		Intent pq4 = new Intent(getApplicationContext(), ProfQ4Activity.class);
        		startActivity(pq4);
        	}
        });
    }
}