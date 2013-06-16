package com.astuetz.viewpager.extensions.sample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class IndexMain extends ListActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index);
		//---List View---
		CustomArrayAdapter adapter = new CustomArrayAdapter(this, RecipeList.getRecipeName(), RecipeList.getRecipeImage());
				setListAdapter(adapter);}
	@Override
	public void onListItemClick(ListView parent, View v,int position, long id) {
		Intent intent = new Intent(IndexMain.this,MainActivity.class);
		intent.putExtra("index", position);
	    startActivity(intent);
	}
}

/*public class IndexMain extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button nextButton = (Button) findViewById(R.id.button);
        nextButton.setOnClickListener(this);
        Button nextButton2 = (Button) findViewById(R.id.button2);
        nextButton2.setOnClickListener(this);
        Button nextButton3 = (Button) findViewById(R.id.button3);
        nextButton3.setOnClickListener(this);
        Button nextButton4 = (Button) findViewById(R.id.button4);
        nextButton4.setOnClickListener(this);
    }
    
   @Override
    public void onClick(View view) {
    	int id = view.getId();
    	Intent intent = new Intent(IndexMain.this,MainActivity.class);;
        switch(id) {
            case R.id.button:
		        intent.putExtra("b", 1);
		        break;
            case R.id.button2:
		        intent.putExtra("b",2);
            	break;
            case R.id.button3:
		        intent.putExtra("b",3);
            	break;
            case R.id.button4:
		        intent.putExtra("b",4);
            	break;
        }
        startActivity(intent);
    }
}*/
