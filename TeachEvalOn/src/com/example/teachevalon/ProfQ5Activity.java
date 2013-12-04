package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class ProfQ5Activity extends Activity{
	RadioButton r1, r2, r3, r4, r5;
	MyDatabaseHelper db = new MyDatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq5);
        Button pq5Submit = (Button) findViewById(R.id.pq5Submit);
        r1 = (RadioButton) findViewById(R.id.vgp5);
        r2 = (RadioButton) findViewById(R.id.gp5);
        r3 = (RadioButton) findViewById(R.id.np5);
        r4 = (RadioButton) findViewById(R.id.pp5);
        r5 = (RadioButton) findViewById(R.id.vpp5);
        pq5Submit.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		if(r1.isChecked()==true){
        			ProfEvalActivity.prfq5="Very Good";
        		db.addSurvey(new Table(ProfEvalActivity.profNameStore, ProfEvalActivity.prfq1,
        				ProfEvalActivity.prfq2, ProfEvalActivity.prfq3, ProfEvalActivity.prfq4,
        				ProfEvalActivity.prfq5, "fattymoocow@gmail.com"));
        		}
        		if(r2.isChecked()==true){
        			ProfEvalActivity.prfq5="Good";
        		db.addSurvey(new Table(ProfEvalActivity.profNameStore, ProfEvalActivity.prfq1,
        				ProfEvalActivity.prfq2, ProfEvalActivity.prfq3, ProfEvalActivity.prfq4,
        				ProfEvalActivity.prfq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r3.isChecked()==true){
        			ProfEvalActivity.prfq5="Nuetral";
        		db.addSurvey(new Table(ProfEvalActivity.profNameStore, ProfEvalActivity.prfq1,
        				ProfEvalActivity.prfq2, ProfEvalActivity.prfq3, ProfEvalActivity.prfq4,
        				ProfEvalActivity.prfq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r4.isChecked()==true){
        			ProfEvalActivity.prfq5="Poor";
        		db.addSurvey(new Table(ProfEvalActivity.profNameStore, ProfEvalActivity.prfq1,
        				ProfEvalActivity.prfq2, ProfEvalActivity.prfq3, ProfEvalActivity.prfq4,
        				ProfEvalActivity.prfq5, "spenceralansmith@yahoo.com"));
        		}
        		if(r5.isChecked()==true){
        			ProfEvalActivity.prfq5="Very Poor";
        		db.addSurvey(new Table(ProfEvalActivity.profNameStore, ProfEvalActivity.prfq1,
        				ProfEvalActivity.prfq2, ProfEvalActivity.prfq3, ProfEvalActivity.prfq4,
        				ProfEvalActivity.prfq5, "spenceralansmith@yahoo.com"));
        		}
        		Intent i = new Intent(Intent.ACTION_SEND);
        		i.setType("message/rfc822");
        		i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"spenceralansmith@yahoo.com"});
        		i.putExtra(Intent.EXTRA_SUBJECT, ProfEvalActivity.profNameStore.concat(" TEO Professor Survey Results."));
        		i.putExtra(Intent.EXTRA_TEXT   , ProfEvalActivity.profNameStore.concat(" TEO Survey Results: \nQuestion 1: ".concat(ProfEvalActivity.prfq1.concat("\nQuestion 2: ".concat(ProfEvalActivity.prfq2.concat("\nQuestion 3: ".concat(ProfEvalActivity.prfq3.concat("\nQueston 4: ".concat(ProfEvalActivity.prfq4.concat("\nQuestion 5: ".concat(ProfEvalActivity.prfq5)))))))))));
        		try {
        		    startActivity(Intent.createChooser(i, "Send mail..."));
        		    Toast.makeText(ProfQ5Activity.this, "Choose an E-Mail client and hit send to complete the Professor survey.", Toast.LENGTH_SHORT).show();
        		} catch (android.content.ActivityNotFoundException ex) {
        		    Toast.makeText(ProfQ5Activity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        		}
        	}
        });
    }
}