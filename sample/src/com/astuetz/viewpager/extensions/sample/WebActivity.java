package com.astuetz.viewpager.extensions.sample;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends Activity{
	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.know_more);
		Bundle extras = getIntent().getExtras();
		int index = extras.getInt("index");
		String webLink = RecipeList.getsetKnowMoreLinkByIndex(index);
		WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(webLink);
	}

}
