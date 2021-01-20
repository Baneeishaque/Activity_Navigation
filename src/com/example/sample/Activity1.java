package com.example.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends Activity {

	Button b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		  
        b2=(Button)findViewById(R.id.button2);
        
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(getApplicationContext(),Activity3.class);
				startActivity(i);
			}
        });
	}



}
