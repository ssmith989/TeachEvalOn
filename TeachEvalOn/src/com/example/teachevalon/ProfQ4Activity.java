package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class ProfQ4Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq4);
        Button pq4Next = (Button) findViewById(R.id.pq4Next);
        r1 = (RadioButton) findViewById(R.id.vgp4);
        r2 = (RadioButton) findViewById(R.id.gp4);
        r3 = (RadioButton) findViewById(R.id.np4);
        r4 = (RadioButton) findViewById(R.id.pp4);
        r5 = (RadioButton) findViewById(R.id.vpp4);
        pq4Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			ProfEvalActivity.prfq4="Very Good";
        		if(r2.isChecked()==true)
        			ProfEvalActivity.prfq4="Good";
        		if(r3.isChecked()==true)
        			ProfEvalActivity.prfq4="Nuetral";
        		if(r4.isChecked()==true)
        			ProfEvalActivity.prfq4="Poor";
        		if(r5.isChecked()==true)
        			ProfEvalActivity.prfq4="Very Poor";
        		Intent pq5 = new Intent(getApplicationContext(), ProfQ5Activity.class);
        		startActivity(pq5);
        	}
        });
    }
}