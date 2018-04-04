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

public class QuestionThree extends AppCompatActivity {

    AnimationDrawable anim;
    ConstraintLayout container;
    int score3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(60);

        score3 =  score.calscore;

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();

        TextView question = findViewById(R.id.question);
        question.setText("Question 5 \n What is the biggest river in the world?");
        Button op1 = findViewById(R.id.button1);
        op1.setText("Nile");
        Button op2 = findViewById(R.id.button2);
        op2.setText("Amazon");
        Button op3 = findViewById(R.id.button3);
        op3.setText("Mississippi-Missouri");
        Button op4 = findViewById(R.id.button4);
        op4.setText("Chang Jiang (Yangtze) ");
    }

    public void optionOne(View view){
        beginActivity(score3);
    }
    public void optionTwo(View view){
        score3 = score3 + 1;
        beginActivity(score3);
    }
    public void optionThree(View view){
        beginActivity(score3);
    }
    public void optionFour(View view){
        beginActivity(score3);
    }
    public void beginActivity(int score3){
        Intent myIntent = new Intent(QuestionThree.this, QuestionFour.class);
        score.calscore = score3;
        QuestionThree.this.startActivity(myIntent);
        this.finish();
    }
}
