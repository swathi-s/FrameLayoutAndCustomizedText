package com.example.user.framelayout;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView i1, i2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.imageView);
        i2 = (ImageView) findViewById(R.id.imageView2);
        t = (TextView) findViewById(R.id.textView);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/zeroes three.ttf");
        t.setTypeface(myCustomFont);
        i1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.VISIBLE);
            }
        });
        i2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.GONE);
            }
        });
    }

}