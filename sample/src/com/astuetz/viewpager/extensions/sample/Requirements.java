package com.astuetz.viewpager.extensions.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
public class Requirements extends Activity implements View.OnClickListener{
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.requiremnet_list);
	        
	        Button kettleButton = (Button) findViewById(R.id.buttonKettle);
	        kettleButton.setOnClickListener(this);
	        
	        Button inductionButton = (Button) findViewById(R.id.buttonInduction);
	        inductionButton.setOnClickListener(this);
	        
	        TextView textViewK = (TextView) findViewById(R.id.textViewKettle);
	        textViewK.setOnClickListener(this);
	        
	        TextView textViewI = (TextView) findViewById(R.id.textViewInduction);
	        textViewI.setOnClickListener(this);

	 }

	@Override
	public void onClick(View v) {
		 int id = v.getId();
	        switch(id)
	        {
	            case R.id.buttonInduction:
	            	TextView textViewK = (TextView) findViewById(R.id.textViewKettle);
	            	break;
	            case R.id.buttonKettle:
	               
	                break;
	            default:

	        }

	    }


	
}
