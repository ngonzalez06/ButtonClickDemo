package com.example.ericsauber.buttonclickdemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity2 extends AppCompatActivity {

    //int button1 = 0;
    //int button2 = 0;
    TextView textView;
    Button playagain;
    Button back;
    Button next;
    int spot = 0;




    int answer[] = new int[10];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        answer[0] = 1;
        answer[1] = 6;
        answer[2] = 2;
        answer[3] = 7;
        answer[4] = 3;
        answer[5] = 8;
        answer[6] = 4;
        answer[7] = 6;
        answer[8] = 5;

        // a-6, b-7, c-8

        answer[9] = -1;
        textView = (TextView) (findViewById(R.id.textview10));
        back = (Button) (findViewById(R.id.button14));
        playagain = (Button) (findViewById(R.id.button15));



    }



    public void gotoMain(View view) {

        Intent intent = new Intent(this, MainActivity.class);
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
        spot++;

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

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);



        }
    }

    public void a(View view) {

        if (answer[spot] != 6) {
            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);

        }
    }

    public void b(View view) {

        if (answer[spot] != 7) {
            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);

        }
    }

    public void c(View view) {

        if (answer[spot] != 8) {
            textView.setText("wrong");
            back.setVisibility(View.VISIBLE);
            playagain.setVisibility(View.VISIBLE);
        }
        spot++;

        if (answer[spot] < 0) {

            textView.setText("Correct!");
            textView.setTextColor(Color.GREEN);
            back.setVisibility(View.VISIBLE);

            next.setVisibility(View.VISIBLE);

        }
    }
}
