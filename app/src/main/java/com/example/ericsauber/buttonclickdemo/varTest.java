package com.example.ericsauber.buttonclickdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class varTest extends AppCompatActivity {

    int x = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_var_test);
    }

    public void add1(View view) {

        textView = (TextView) (findViewById(R.id.tv));

        x++;
        textView.setText(""+x);


    }


}
