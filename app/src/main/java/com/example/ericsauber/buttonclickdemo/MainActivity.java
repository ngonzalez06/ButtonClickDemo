package com.example.ericsauber.buttonclickdemo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class  MainActivity extends AppCompatActivity {

    TextView textView;
    Integer num = 0;

    static int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        // PLAY MUSIC
        if (x == 0) {
            MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.x);
            ring.start();
        }

        x++;
        */
    }

    public void changeColor(View view) {

        textView = (TextView) (findViewById(R.id.textViewHello));

        if (num == 0) {
            textView.setTextColor(Color.parseColor("#FF0000"));
            textView.setText("This is Red");
            num = 1;
        }
        else {
            textView.setTextColor(Color.parseColor("#0000FF"));
            textView.setText("This is Blue");
            num = 0;
        }
    }

    public void gotoColorActivity(View view) {

        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }

    public void gotoInstructionsActivity(View view) {

        // sorry the naming for activites is inconsistent here
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }

    public void gotoTutorialActivity(View view) {

        Intent intent = new Intent(this, TutorialActivity.class);
        startActivity(intent);
    }

    public void gotoGameActivity(View view) {

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void gotoLevels(View view) {

        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }
}
