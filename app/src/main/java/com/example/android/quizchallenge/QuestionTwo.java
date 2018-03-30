package com.example.android.quizchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class QuestionTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(40);
    }

    public void optionOne(View view){
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
    public void optionTwo(View view){
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
    public void optionThree(View view){
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
    public void optionFour(View view){
        Intent myIntent = new Intent(QuestionTwo.this, QuestionThree.class);
        QuestionTwo.this.startActivity(myIntent);
        this.finish();
    }
}