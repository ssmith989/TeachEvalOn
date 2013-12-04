package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class ProfQ1Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq1);
        r1 = (RadioButton) findViewById(R.id.vgp1);
        r2 = (RadioButton) findViewById(R.id.gp1);
        r3 = (RadioButton) findViewById(R.id.np1);
        r4 = (RadioButton) findViewById(R.id.pp1);
        r5 = (RadioButton) findViewById(R.id.vpp1);
        Button pq1Next = (Button) findViewById(R.id.pq1Next);
        pq1Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			ProfEvalActivity.prfq1="Very Good";
        		if(r2.isChecked()==true)
        			ProfEvalActivity.prfq1="Good";
        		if(r3.isChecked()==true)
        			ProfEvalActivity.prfq1="Nuetral";
        		if(r4.isChecked()==true)
        			ProfEvalActivity.prfq1="Poor";
        		if(r5.isChecked()==true)
        			ProfEvalActivity.prfq1="Very Poor";
        		Intent pq2 = new Intent(getApplicationContext(), ProfQ2Activity.class);
        		startActivity(pq2);
        	}
        });
    }
}