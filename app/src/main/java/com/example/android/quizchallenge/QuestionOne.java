package com.example.android.quizchallenge;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class QuestionOne extends AppCompatActivity {
    AnimationDrawable anim;
    ConstraintLayout container;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(20);
        //Hey

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();
    }

    public void optionOne(View view){
        Intent myIntent = new Intent(QuestionOne.this, QuestionTwo.class);
        myIntent.putExtra("score", score);
        QuestionOne.this.startActivity(myIntent);
        this.finish();
    }
    public void optionTwo(View view){
        score = score + 1;
        Intent myIntent = new Intent(QuestionOne.this, QuestionTwo.class);
        myIntent.putExtra("score1", score);
        QuestionOne.this.startActivity(myIntent);
        this.finish();
    }
    public void optionThree(View view){
        Intent myIntent = new Intent(QuestionOne.this, QuestionTwo.class);
        myIntent.putExtra("score", score);
        QuestionOne.this.startActivity(myIntent);
        this.finish();
    }
    public void optionFour(View view){
        Intent myIntent = new Intent(QuestionOne.this, QuestionTwo.class);
        myIntent.putExtra("score", score);
        QuestionOne.this.startActivity(myIntent);
        this.finish();
    }
}