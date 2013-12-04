package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.Activity;
import android.content.Intent;


public class ProfQ2Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq2);
        Button pq2Next = (Button) findViewById(R.id.pq2Next);
        r1 = (RadioButton) findViewById(R.id.vgp2);
        r2 = (RadioButton) findViewById(R.id.gp2);
        r3 = (RadioButton) findViewById(R.id.np2);
        r4 = (RadioButton) findViewById(R.id.pp2);
        r5 = (RadioButton) findViewById(R.id.vpp2);
        pq2Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true)
        			ProfEvalActivity.prfq2="Very Good";
        		if(r2.isChecked()==true)
        			ProfEvalActivity.prfq2="Good";
        		if(r3.isChecked()==true)
        			ProfEvalActivity.prfq2="Nuetral";
        		if(r4.isChecked()==true)
        			ProfEvalActivity.prfq2="Poor";
        		if(r5.isChecked()==true)
        			ProfEvalActivity.prfq2="Very Poor";
        		Intent pq3 = new Intent(getApplicationContext(), ProfQ3Activity.class);
        		startActivity(pq3);
        	}
        });
    }
}