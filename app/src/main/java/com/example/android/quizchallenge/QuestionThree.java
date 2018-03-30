package com.example.android.quizchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class QuestionThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_three);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(60);
    }

    public void optionOne(View view){
        Intent myIntent = new Intent(QuestionThree.this, QuestionFour.class);
        QuestionThree.this.startActivity(myIntent);
        this.finish();
    }
    public void optionTwo(View view){
        Intent myIntent = new Intent(QuestionThree.this, QuestionFour.class);
        QuestionThree.this.startActivity(myIntent);
        this.finish();
    }
    public void optionThree(View view){
        Intent myIntent = new Intent(QuestionThree.this, QuestionFour.class);
        QuestionThree.this.startActivity(myIntent);
        this.finish();
    }
    public void optionFour(View view){
        Intent myIntent = new Intent(QuestionThree.this, QuestionFour.class);
        QuestionThree.this.startActivity(myIntent);
        this.finish();
    }
}
