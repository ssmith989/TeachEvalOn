package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;


public class ProfEvalActivity extends Activity{
	public static String profNameStore;
	public static String prfq1;
	public static String prfq2;
	public static String prfq3;
	public static String prfq4;
	public static String prfq5;
	
	EditText prfName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profeval);
        
        prfName = (EditText) findViewById(R.id.profName);
        Button btnProfStart = (Button) findViewById(R.id.btnProfStart);
        btnProfStart.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		profNameStore = prfName.getText().toString();
        		Intent pq1 = new Intent(getApplicationContext(), ProfQ1Activity.class);
        		startActivity(pq1);
        	}
        });
    }
}