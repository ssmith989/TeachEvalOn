package com.example.teachevalon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class ProfQ4Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profq4);
        Button pq4Next = (Button) findViewById(R.id.pq4Next);
        pq4Next.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0){
        		Intent pq5 = new Intent(getApplicationContext(), ProfQ5Activity.class);
        		startActivity(pq5);
        	}
        });
    }
}