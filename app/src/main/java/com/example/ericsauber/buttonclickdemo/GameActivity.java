package com.example.ericsauber.buttonclickdemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    int button1 = 0;
    int button2 = 0;
    TextView textView;
    TextView progress;
    Button playagain;
    Button back;
    Button next;
    Button one;
    int spot = 0;




    int answer[] = new int[6];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 3;
        answer[3] = 4;
        answer[4] = 5;
        answer[5] = -1;

        textView = (TextView) (findViewById(R.id.textview10));
        progress = (TextView) (findViewById(R.id.progressTV));
        back = (Button) (findViewById(R.id.button14));
        playagain = (Button) (findViewById(R.id.button15));
        next = (Button) (findViewById(R.id.button16));
        one = (Button) (findViewById(R.id.buttonOne));


    }



    public void gotoMain(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoGameActivity(View view) {

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void gotoGameActivity2(View view) {

        Intent intent = new Intent(this, GameActivity2.class);
        startActivity(intent);
    }

    public void one(View view) {

        if (answer[spot] != 1) {

            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);

        }
        else {

            spot++;
            progress.setText("" + spot + "/5");
            one.setBackgroundResource(android.R.drawable.btn_default);

        }


        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);


        }
    }

    public void two(View view) {

        if (answer[spot] != 2) {
            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/5");

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);


        }
    }

    public void three(View view) {


        if (answer[spot] != 3) {
            textView.setText("Wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/5");

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);


        }
    }

    public void four(View view) {

        if (answer[spot] != 4) {
            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/5");

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);


        }
    }

    public void five(View view) {

        if (answer[spot] != 5) {
            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/5");

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);


        }
    }
}
