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

public class QuestionFive extends AppCompatActivity {

    AnimationDrawable anim;
    ConstraintLayout container;
    int score5 = getIntent().getExtras().getInt("score4");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(100);

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();

        TextView question = findViewById(R.id.question);
        question.setText("Question 5 \n What is the largest coffee growing country in the world?");
        Button op1 = findViewById(R.id.button1);
        op1.setText("America");
        Button op2 = findViewById(R.id.button2);
        op2.setText("Italy");
        Button op3 = findViewById(R.id.button3);
        op3.setText("Brazil");
        Button op4 = findViewById(R.id.button4);
        op4.setText("England");
    }

    public void optionOne(View view){
        Intent myIntent = new Intent(QuestionFive.this, FinalScore.class);
        myIntent.putExtra("score", score5);
        QuestionFive.this.startActivity(myIntent);
        this.finish();
    }
    public void optionTwo(View view){
        Intent myIntent = new Intent(QuestionFive.this, FinalScore.class);
        myIntent.putExtra("score", score5);
        QuestionFive.this.startActivity(myIntent);
        this.finish();
    }
    public void optionThree(View view){
        score5 = score5 + 1;
        Intent myIntent = new Intent(QuestionFive.this, FinalScore.class);
        myIntent.putExtra("score", score5);
        QuestionFive.this.startActivity(myIntent);
        this.finish();
    }
    public void optionFour(View view){
        Intent myIntent = new Intent(QuestionFive.this, FinalScore.class);
        myIntent.putExtra("score", score5);
        QuestionFive.this.startActivity(myIntent);
        this.finish();
    }
}
