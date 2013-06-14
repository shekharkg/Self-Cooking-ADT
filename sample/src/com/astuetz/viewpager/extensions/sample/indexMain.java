package com.astuetz.viewpager.extensions.sample;

import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
public class indexMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button nextButton = (Button) findViewById(R.id.button);
        nextButton.setOnClickListener((OnClickListener) this);
    }
    public void onClick(View view) {
        Intent intent=new Intent(indexMain.this,MainActivity.class);
        startActivity(intent);
    }
}
