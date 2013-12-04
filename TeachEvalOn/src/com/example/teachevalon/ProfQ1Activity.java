package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class ProfQ1Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq1);
        Button pq1Next = (Button) findViewById(R.id.pq1Next);
        pq1Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent pq2 = new Intent(getApplicationContext(), ProfQ2Activity.class);
        		startActivity(pq2);
        	}
        });
    }
}