package com.astuetz.viewpager.extensions.sample;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<String>{
	private final Activity context;
	private final String[] receipe;
	private final Integer[] images;
	
	public CustomArrayAdapter(Activity context,String[] receipe, Integer[] images) {
		super(context, R.layout.lv_row, receipe);
		this.context = context;
		this.receipe = receipe;
		this.images = images;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		
		//---print the index of the row to examine---
		Log.d("CustomArrayAdapter",String.valueOf(position));
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView= inflater.inflate(R.layout.lv_row, null, true);
		
		//---get a reference to all the views on the xml layout---
		TextView txtTitle = (TextView) rowView.findViewById(R.id.txtReceipeName);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		txtTitle.setTextColor(RecipeList.getColor());
		//---customize the content of each row based on position---
		txtTitle.setText(receipe[position]);
		imageView.setImageResource(images[position]);
		return rowView;
	}
}
