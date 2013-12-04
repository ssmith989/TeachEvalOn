package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class ProfQ3Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq3);
        Button pq3Next = (Button) findViewById(R.id.pq3Next);
        pq3Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent pq4 = new Intent(getApplicationContext(), ProfQ4Activity.class);
        		startActivity(pq4);
        	}
        });
    }
}