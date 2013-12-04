package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;



public class TA1Q5Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
	MyDatabaseHelper db = new MyDatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1q5);
        r1 = (RadioButton) findViewById(R.id.vgta15);
        r2 = (RadioButton) findViewById(R.id.gta15);
        r3 = (RadioButton) findViewById(R.id.nta15);
        r4 = (RadioButton) findViewById(R.id.pta15);
        r5 = (RadioButton) findViewById(R.id.vpta15);
        Button ta1q5Submit = (Button) findViewById(R.id.ta1q5Submit);
        ta1q5Submit.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true){
        			TA1EvalActivity.taq5="Very Good";
        		db.addSurvey(new Table(TA1EvalActivity.taNameStore, TA1EvalActivity.taq1,
        				TA1EvalActivity.taq2, TA1EvalActivity.taq3, TA1EvalActivity.taq4,
        				TA1EvalActivity.taq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r2.isChecked()==true){
        			TA1EvalActivity.taq5="Good";
        		db.addSurvey(new Table(TA1EvalActivity.taNameStore, TA1EvalActivity.taq1,
        				TA1EvalActivity.taq2, TA1EvalActivity.taq3, TA1EvalActivity.taq4,
        				TA1EvalActivity.taq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r3.isChecked()==true){
        			TA1EvalActivity.taq5="Nuetral";
        		db.addSurvey(new Table(TA1EvalActivity.taNameStore, TA1EvalActivity.taq1,
        				TA1EvalActivity.taq2, TA1EvalActivity.taq3, TA1EvalActivity.taq4,
        				TA1EvalActivity.taq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r4.isChecked()==true){
        			TA1EvalActivity.taq5="Poor";
        		db.addSurvey(new Table(TA1EvalActivity.taNameStore, TA1EvalActivity.taq1,
        				TA1EvalActivity.taq2, TA1EvalActivity.taq3, TA1EvalActivity.taq4,
        				TA1EvalActivity.taq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r5.isChecked()==true){
        			TA1EvalActivity.taq5="Very Poor";
        		db.addSurvey(new Table(TA1EvalActivity.taNameStore, TA1EvalActivity.taq1,
        				TA1EvalActivity.taq2, TA1EvalActivity.taq3, TA1EvalActivity.taq4,
        				TA1EvalActivity.taq5, "spenceralansmith@yahoo.com"));
        		}
        		Intent i = new Intent(Intent.ACTION_SEND);
        		i.setType("message/rfc822");
        		i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"spenceralansmith@yahoo.com"});
        		i.putExtra(Intent.EXTRA_SUBJECT, TA1EvalActivity.taNameStore.concat(" TEO Teacher Assistant Survey Results."));
        		i.putExtra(Intent.EXTRA_TEXT   , TA1EvalActivity.taNameStore.concat(" TEO Survey Results: \nQuestion 1: ".concat(TA1EvalActivity.taq1.concat("\nQuestion 2: ".concat(TA1EvalActivity.taq2.concat("\nQuestion 3: ".concat(TA1EvalActivity.taq3.concat("\nQueston 4: ".concat(TA1EvalActivity.taq4.concat("\nQuestion 5: ".concat(TA1EvalActivity.taq5)))))))))));
        		try {
        		    startActivity(Intent.createChooser(i, "Send mail..."));
        		    Toast.makeText(TA1Q5Activity.this, "Choose an E-Mail client and hit send to complete the Teaching Assistant survey.", Toast.LENGTH_SHORT).show();
        		} catch (android.content.ActivityNotFoundException ex) {
        		    Toast.makeText(TA1Q5Activity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        		}
        	}
        });
    }
}