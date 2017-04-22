package com.example.ericsauber.buttonclickdemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {


    TextView textView3;
    Button playagain3;
    Button back3;
    Button five;
    Button c;
    Button rock;
    Button tru;
    Button next3;
    int spot = 0;
    TextView progress;




    int answer[] = new int[21];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);


        answer[0] = 5;
        answer[1] = 9;
        answer[2] = 11;
        answer[3] = 14;
        answer[4] = 6;
        answer[5] = 10;
        answer[6] = 12;
        answer[7] = 15;
        answer[8] = 1;
        answer[9] = 7;
        answer[10] = 13;
        answer[11] = 14;
        answer[12] = 2;
        answer[13] = 8;
        answer[14] = 11;
        answer[15] = 15;
        answer[16] = 3;
        answer[17] = 9;
        answer[18] = 12;
        answer[19] = 14;
        answer[20] = -1;

        // a-6, b-7, c-8

        five = (Button) (findViewById(R.id.button29));
        tru = (Button) (findViewById(R.id.button3_T));
        c = (Button) (findViewById(R.id.button3_c));
        rock = (Button) (findViewById(R.id.button3_rock));
        textView3 = (TextView) (findViewById(R.id.correct3));
        back3 = (Button) (findViewById(R.id.back3));
        playagain3 = (Button) (findViewById(R.id.pa3));
        next3 = (Button) (findViewById(R.id.next3));

        progress = (TextView) (findViewById(R.id.progress3));




    }




    public void one(View view) {

        if (answer[spot] != 1) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }

    }

    public void two(View view) {

        if (answer[spot] != 2) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void three(View view) {

        if (answer[spot] != 3) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void four(View view) {

        if (answer[spot] != 4) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }
    }

    public void five(View view) {

        if (answer[spot] != 5) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        else {
            spot++;
            five.setBackgroundResource(android.R.drawable.btn_default);
            c.setBackgroundColor(Color.parseColor("#FF3F51B5"));

        }

        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void six(View view) {



        if (answer[spot] != 6) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }

    }

    public void a(View view) {

        if (answer[spot] != 7) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void b(View view) {

        if (answer[spot] != 8) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void c(View view) {

        if (answer[spot] != 9) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        else {
            spot++;
            c.setBackgroundResource(android.R.drawable.btn_default);





        }

        if (spot < 5)
            rock.setBackgroundColor(Color.parseColor("#FF3F51B5"));

        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void d(View view) {

        if (answer[spot] != 10) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void rock(View view) {

        if (answer[spot] != 11) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        else {
            spot++;
            rock.setBackgroundResource(android.R.drawable.btn_default);


        }

        if (spot < 5)
            tru.setBackgroundColor(Color.parseColor("#FF3F51B5"));

        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void paper(View view) {

        if (answer[spot] != 12) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void scissor(View view) {

        if (answer[spot] != 13) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void tru(View view) {

        tru.setBackgroundResource(android.R.drawable.btn_default);

        if (answer[spot] != 14) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }
    public void fals(View view) {

        if (answer[spot] != 15) {
            textView3.setText("wrong");
            back3.setVisibility(View.VISIBLE);
            playagain3.setVisibility(View.VISIBLE);
        }
        spot++;
        progress.setText(""+spot+"/20");

        if (answer[spot] < 0) {

            textView3.setText("Correct!");
            textView3.setTextColor(Color.GREEN);
            back3.setVisibility(View.VISIBLE);
            next3.setVisibility(View.VISIBLE);
        }


    }

    public void level3(View view) {

        Intent intent = new Intent(this, Level3.class);
        startActivity(intent);


    }








}
