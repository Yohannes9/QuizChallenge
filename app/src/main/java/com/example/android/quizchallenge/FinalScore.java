package com.example.android.quizchallenge;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalScore extends AppCompatActivity {
    AnimationDrawable anim;
    ConstraintLayout container;
    int scoreFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_final_score);

        scoreFinal = score.calscore;

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();

        TextView score = findViewById(R.id.textView2);
        score.setText(scoreFinal+"/5");
    }

    public void Reset(View v){
        Intent myIntent = new Intent(FinalScore.this, QuestionOne.class);
        score.calscore = 0;
        this.startActivity(myIntent);
        this.finish();
    }
}
