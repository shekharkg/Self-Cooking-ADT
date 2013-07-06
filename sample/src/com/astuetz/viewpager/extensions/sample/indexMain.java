package com.astuetz.viewpager.extensions.sample;

import android.annotation.TargetApi;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class IndexMain extends ListActivity {
	
	private final Handler handler = new Handler();

	//request code
	protected static final int COLOR_CHANGE_MENU = 002;
	CustomArrayAdapter adapter;
	private Drawable oldBackground = null;
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
		adapter = new CustomArrayAdapter(this, RecipeList.getRecipeName(), RecipeList.getRecipeImage());
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
				break;
		case R.id.action_info:
			Intent info = new Intent(this, Requirements.class);
			startActivity(info);
			break;
			
			
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
				adapter.notifyDataSetChanged();
			}
		}
	}
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void changeColor(int newColor) {


		// change ActionBar color just if an ActionBar is available
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			Drawable colorDrawable = new ColorDrawable(newColor);
			Drawable bottomDrawable = getResources().getDrawable(R.drawable.actionbar_bottom);
			LayerDrawable ld = new LayerDrawable(new Drawable[] { colorDrawable, bottomDrawable });

			if (oldBackground == null) {
				if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
					ld.setCallback(drawableCallback);
				} else {
					getActionBar().setBackgroundDrawable(ld);
				}
			} else {
				TransitionDrawable td = new TransitionDrawable(new Drawable[] { oldBackground, ld });

				// workaround for broken ActionBarContainer drawable handling on
				// pre-API 17 builds
				// https://github.com/android/platform_frameworks_base/commit/a7cc06d82e45918c37429a59b14545c6a57db4e4
				if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
					td.setCallback(drawableCallback);
				} else {
					getActionBar().setBackgroundDrawable(td);
				}

				td.startTransition(200);
			}

			oldBackground = ld;

			// http://stackoverflow.com/questions/11002691/actionbar-setbackgrounddrawable-nulling-background-from-thread-handler
			getActionBar().setDisplayShowTitleEnabled(false);
			getActionBar().setDisplayShowTitleEnabled(true);
		}

		RecipeList.setColor(newColor);
	}
	private Drawable.Callback drawableCallback = new Drawable.Callback() {
		@Override
		public void invalidateDrawable(Drawable who) {
			getActionBar().setBackgroundDrawable(who);
		}

		@Override
		public void scheduleDrawable(Drawable who, Runnable what, long when) {
			handler.postAtTime(what, when);
		}

		@Override
		public void unscheduleDrawable(Drawable who, Runnable what) {
			handler.removeCallbacks(what);
		}
	};
}