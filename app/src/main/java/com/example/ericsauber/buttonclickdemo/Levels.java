package com.example.ericsauber.buttonclickdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
    }

    public void level1(View view) {

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);


    }

    public void level2(View view) {

        Intent intent = new Intent(this, GameActivity2.class);
        startActivity(intent);


    }

    public void level3(View view) {

        Intent intent = new Intent(this, Level3.class);
        startActivity(intent);


    }
    public void level4(View view) {

        Intent intent = new Intent(this, Level4.class);
        startActivity(intent);


    }
}
