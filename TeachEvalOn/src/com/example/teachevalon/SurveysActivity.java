package com.example.teachevalon;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SurveysActivity extends Activity implements OnItemClickListener {
	ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        listView = (ListView) findViewById(R.id.surveysView1);
        listView.setOnItemClickListener(this);
    }

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
		Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                Toast.LENGTH_SHORT).show();
		
	}
}