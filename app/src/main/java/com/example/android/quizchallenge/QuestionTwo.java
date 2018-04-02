package com.example.android.quizchallenge;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuestionTwo extends AppCompatActivity {

    AnimationDrawable anim;
    ConstraintLayout container;
    int score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(40);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            score2 = extras.getInt("score1",2);
            //The key argument here must match that used in the other activity
        }

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();

        TextView question = findViewById(R.id.question);
        question.setText("Question 2 \n How many people are there in the world?");
        Button op1 = findViewById(R.id.button1);
        op1.setText("6 Billion");
        Button op2 = findViewById(R.id.button2);
        op2.setText("4 Billion");
        Button op3 = findViewById(R.id.button3);
        op3.setText("1 Billion");
        Button op4 = findViewById(R.id.button4);
        op4.setText("7 Billion");
    }

    public void optionOne(View view){
        beginActivity(score2);
    }
    public void optionTwo(View view){
        beginActivity(score2);
    }
    public void optionThree(View view){
        beginActivity(score2);
    }
    public void optionFour(View view){
        score2 = score2 + 1;
        beginActivity(score2);
    }
    public void beginActivity(int score2){
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        myIntent.putExtra("score", score2);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
}