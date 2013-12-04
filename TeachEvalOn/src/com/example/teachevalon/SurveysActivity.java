package com.example.teachevalon;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

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
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			    switch( position )
			    {
			       case 0:  Intent profActivity = new Intent(this, ProfEvalActivity.class);     
			                startActivity(profActivity);
			                break;
			       case 1:  Intent ta1Activity = new Intent(this, TA1EvalActivity.class);     
			                startActivity(ta1Activity);
			                break;
			       case 2:  Intent ta2Activity = new Intent(this, TA2EvalActivity.class);     
			                startActivity(ta2Activity);
			                break;
			       /*case 3:  Intent newActivity = new Intent(this, karaiskaki.class);     
			                startActivity(newActivity);
			                break;
			       case 4:  Intent newActivity = new Intent(this, reservetickets.class);     
			                startActivity(newActivity);
			                break;*/
			    }
	}
}