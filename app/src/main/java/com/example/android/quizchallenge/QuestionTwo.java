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
    int score = getIntent().getExtras().getInt("score");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(40);

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
        score = score + 0;
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        myIntent.putExtra("score", score);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
    public void optionTwo(View view){
        score = score + 0;
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        myIntent.putExtra("score", score);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
    public void optionThree(View view){
        score = score + 0;
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        myIntent.putExtra("score", score);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
    public void optionFour(View view){
        score = score + 1;
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        myIntent.putExtra("score", score);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
}