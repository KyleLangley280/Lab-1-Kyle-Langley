package com.example.lab1kylelangley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 50;
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText(String.valueOf(counter));
    }
    public void onClickIncrement(View v) {
        counter++;
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText(String.valueOf(counter));
    }
    public void onClickDecrement(View v) {
        counter--;
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText((String.valueOf(counter)));
    }
}

