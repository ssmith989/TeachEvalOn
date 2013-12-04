package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class ProfQ2Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq2);
        Button pq2Next = (Button) findViewById(R.id.pq2Next);
        pq2Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent pq3 = new Intent(getApplicationContext(), ProfQ3Activity.class);
        		startActivity(pq3);
        	}
        });
    }
}