package com.bna.bijendrakarmakar.catchthebunny;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class secondOne extends AppCompatActivity {

    ImageView bunny1, bunny2, bunny3, bunny4, bunny5, bunny6, bunny7, bunny8, bunny9;

    Button button;

    TextView left, score;

    TextView highScore;

    Random r;

    int tv_score = 0, tv_left = 5, fps = 1000, tempifleft = 0;

    int which = 0;
    int whichsave = 0;

    AnimationDrawable an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_one);

        r = new Random();

        button = (Button) findViewById(R.id.button);

        left = (TextView) findViewById(R.id.left);

        score = (TextView) findViewById(R.id.score);

        highScore = (TextView) findViewById(R.id.highscore);

        bunny1 = (ImageView) findViewById(R.id.bunny1);
        bunny2 = (ImageView) findViewById(R.id.bunny2);
        bunny3 = (ImageView) findViewById(R.id.bunny3);
        bunny4 = (ImageView) findViewById(R.id.bunny4);
        bunny5 = (ImageView) findViewById(R.id.bunny5);
        bunny6 = (ImageView) findViewById(R.id.bunny6);
        bunny7 = (ImageView) findViewById(R.id.bunny7);
        bunny8 = (ImageView) findViewById(R.id.bunny8);
        bunny9 = (ImageView) findViewById(R.id.bunny9);

        bunny1.setVisibility(View.INVISIBLE);
        bunny2.setVisibility(View.INVISIBLE);
        bunny3.setVisibility(View.INVISIBLE);
        bunny4.setVisibility(View.INVISIBLE);
        bunny5.setVisibility(View.INVISIBLE);
        bunny6.setVisibility(View.INVISIBLE);
        bunny7.setVisibility(View.INVISIBLE);
        bunny8.setVisibility(View.INVISIBLE);
        bunny9.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_left = 5;
                left.setText("LIFE LEFT : " + tv_left);
                tv_score = 0;
                score.setText("SCORE : " + tv_score);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        theGameActions();
                    }
                }, 1000);
                button.setEnabled(false);
            }
        });

        bunny1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny1.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny1.setEnabled(false);
            }
        });

        bunny2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny2.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny2.setEnabled(false);
            }
        });

        bunny3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny3.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny3.setEnabled(false);
            }
        });

        bunny4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny4.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny4.setEnabled(false);
            }
        });

        bunny5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny5.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny5.setEnabled(false);
            }
        });

        bunny6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny6.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny6.setEnabled(false);
            }
        });

        bunny7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny7.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny7.setEnabled(false);
            }
        });

        bunny8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny8.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny8.setEnabled(false);
            }
        });

        bunny9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempifleft = 1;
                bunny9.setImageResource(R.drawable.full);
                tv_score = tv_score + 1;
                score.setText("SCORE : " + tv_score);
                bunny9.setEnabled(false);
            }
        });




    }

    private void theGameActions(){
        if (tv_score < 10){
            fps = 1000;
        } else if (tv_score >= 10 && tv_score < 15 ){
            fps = 950;
        } else if (tv_score >= 15 && tv_score < 20 ){
            fps = 900;
        } else if (tv_score >= 20 && tv_score < 25 ){
            fps = 850;
        } else if (tv_score >= 25 && tv_score < 30 ){
            fps = 800;
        } else if (tv_score >= 30 && tv_score < 35 ){
            fps = 750;
        } else if (tv_score >= 35 && tv_score < 40 ){
            fps = 700;
        } else if (tv_score >= 40 && tv_score < 45 ){
            fps = 650;
        } else if (tv_score >= 45 && tv_score < 50 ){
            fps = 600;
        } else if (tv_score >= 50 && tv_score < 55 ){
            fps = 550;
        } else if (tv_score >= 55 && tv_score < 60 ){
            fps = 500;
        } else if (tv_score >= 60 && tv_score < 65 ) {
            fps = 450;
        } else if (tv_score >= 65 && tv_score < 70 ) {
            fps = 400;
        } else if (tv_score >= 70 ) {
            fps = 350;
        }

        an = (AnimationDrawable) ContextCompat.getDrawable(this, R.drawable.anim);

        do {
            which = r.nextInt(9) + 1;
        } while( whichsave == which);
        whichsave = which;

        if (which == 1){
            bunny1.setImageDrawable(an);
            bunny1.setVisibility(View.VISIBLE);
            bunny1.setEnabled(true);
        } else  if (which == 2){
            bunny2.setImageDrawable(an);
            bunny2.setVisibility(View.VISIBLE);
            bunny2.setEnabled(true);
        } else  if (which == 3){
            bunny3.setImageDrawable(an);
            bunny3.setVisibility(View.VISIBLE);
            bunny3.setEnabled(true);
        } else  if (which == 4){
            bunny4.setImageDrawable(an);
            bunny4.setVisibility(View.VISIBLE);
            bunny4.setEnabled(true);
        } else  if (which == 5){
            bunny5.setImageDrawable(an);
            bunny5.setVisibility(View.VISIBLE);
            bunny5.setEnabled(true);
        } else  if (which == 6){
            bunny6.setImageDrawable(an);
            bunny6.setVisibility(View.VISIBLE);
            bunny6.setEnabled(true);
        } else  if (which == 7){
            bunny7.setImageDrawable(an);
            bunny7.setVisibility(View.VISIBLE);
            bunny7.setEnabled(true);
        } else  if (which == 8){
            bunny8.setImageDrawable(an);
            bunny8.setVisibility(View.VISIBLE);
            bunny8.setEnabled(true);
        } else  if (which == 9){
            bunny9.setImageDrawable(an);
            bunny9.setVisibility(View.VISIBLE);
            bunny9.setEnabled(true);
        }

        SharedPreferences share = getSharedPreferences("HIGH_SCORE", Context.MODE_PRIVATE);
        final int high = share.getInt("HIGH_SCORE", 0);

        if(tv_score > high){
            highScore.setText("HIGH SCORE : " + tv_score);

            SharedPreferences.Editor editor = share.edit();
            editor.putInt("HIGH_SCORE", tv_score);
            editor.commit();

        } else {
            highScore.setText("HIGH SCORE : " + high);
        }

        an.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                bunny1.setVisibility(View.INVISIBLE);
                bunny2.setVisibility(View.INVISIBLE);
                bunny3.setVisibility(View.INVISIBLE);
                bunny4.setVisibility(View.INVISIBLE);
                bunny5.setVisibility(View.INVISIBLE);
                bunny6.setVisibility(View.INVISIBLE);
                bunny7.setVisibility(View.INVISIBLE);
                bunny8.setVisibility(View.INVISIBLE);
                bunny9.setVisibility(View.INVISIBLE);

                bunny1.setEnabled(false);
                bunny2.setEnabled(false);
                bunny3.setEnabled(false);
                bunny4.setEnabled(false);
                bunny5.setEnabled(false);
                bunny6.setEnabled(false);
                bunny7.setEnabled(false);
                bunny8.setEnabled(false);
                bunny9.setEnabled(false);

                if (tempifleft == 0){
                    tv_left = tv_left - 1;
                    left.setText("LIFE LEFT : " + tv_left);

                } else if (tempifleft ==1 ){
                    left.setText("LIFE LEFT : " + tv_left);
                    tempifleft = 0;
                }

                if (tv_left == 0){
                    Toast.makeText(secondOne.this, "GAME OVER", Toast.LENGTH_SHORT).show();
                    button.setEnabled(true);
                    if(tv_score > high){
                        Toast.makeText(secondOne.this, "NEW HIGH SCORE", Toast.LENGTH_SHORT).show();
                    }
                } else if (tv_left > 0){
                    theGameActions();
                }
            }
        }, fps);
    }
}
