/*
 * Copyright (C) 2013 Andreas Stuetz <andreas.stuetz@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.astuetz.viewpager.extensions.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public class SuperAwesomeCardFragment extends Fragment {

	private static final String ARG_POSITION = "position";

	private int position;

	public static SuperAwesomeCardFragment newInstance(int position) {
		SuperAwesomeCardFragment f = new SuperAwesomeCardFragment();
		Bundle b = new Bundle();
		b.putInt(ARG_POSITION, position);
		f.setArguments(b);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		position = getArguments().getInt(ARG_POSITION);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

		FrameLayout fl = new FrameLayout(getActivity());
		fl.setLayoutParams(params);

		final int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources()
				.getDisplayMetrics());

		WebView v = new WebView(getActivity());
		params.setMargins(margin, margin, margin, margin);
		v.setLayoutParams(params);
		v.setLayoutParams(params);
		v.setBackgroundResource(R.drawable.background_card);
		if(position==0){
			String ingredients = "<html><body><div><ol><li>2-3 potatoes</li><li>2 onions</li> <li>2 tbsp chilli powder</li><li>1 tbsp salt or as desired</li><li>1-2 tbsp tomato sauce</li></ol></div></body></html>";
			v.loadData(ingredients, "text/html", null);
		}
		else{
			String steps = "<html><body><div><ol><li>Add water to the Electric kettle and switch on it to boil.</li><li>After 2 minutes add potatoes and allowed it to boil for approx 5 minutes.</li><li>Check it again and allowed it to boil for 5 more minutes.</li><li>By the time chop the onions.</li><li>Take out the boiled potatoes from the kettle and allowed it to cool.</li><li>Peel the skin of the potatoes and mash it up with your hands.</li><li>Add the left out ingredients and mix it well.</li><li>Your Aloo Mash is ready to eat with boiled rice or as suitable.</li></ol></div></body></html> ";
			v.loadData(steps, "text/html", null);
		}
		ScrollView scrollView = new ScrollView(getActivity());
		scrollView.addView(v);
		fl.addView(scrollView);
		return fl;
	}
}