package com.example.imageswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity
{
    public void clickView(View view) {
        Log.i("Info", "Button pressed!");

        ImageView image = (ImageView) findViewById(R.id.viewImage);
        image.setImageResource(R.drawable.cat2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
