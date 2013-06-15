package com.astuetz.viewpager.extensions.sample;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class ColorChange extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_color);
    }

	public void onColorClicked(View v) {
		int color = Color.parseColor(v.getTag().toString());
		Intent intent = new Intent();
		intent.putExtra("color", color);
		setResult(RESULT_OK, intent);
		this.finish();
	}
	
}