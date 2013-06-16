package com.astuetz.viewpager.extensions.sample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class IndexMain extends ListActivity {
	
	//request code
	protected static final int COLOR_CHANGE_MENU = 002;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.index);
		//---List View---
		CustomArrayAdapter adapter = new CustomArrayAdapter(this, RecipeList.getRecipeName(), RecipeList.getRecipeImage());
		setListAdapter(adapter);
	}
	
	@Override
	public void onListItemClick(ListView parent, View v,int position, long id) {
		Intent intent = new Intent(IndexMain.this,MainActivity.class);
		intent.putExtra("index", position);
	    startActivity(intent);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_color:
				Intent i = new Intent(this, ColorChange.class);
				startActivityForResult(i, COLOR_CHANGE_MENU);
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode == COLOR_CHANGE_MENU) {
			if(resultCode == RESULT_OK) {
				int color = data.getIntExtra("color", 0);
				changeColor(color);
			}
		}
	}
	
	public void changeColor(int newColor) {
		RecipeList.setColor(newColor);
	}
}