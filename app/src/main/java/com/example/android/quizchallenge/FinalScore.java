package com.example.android.quizchallenge;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalScore extends AppCompatActivity {
    AnimationDrawable anim;
    ConstraintLayout container;
    int scoreFinal = getIntent().getExtras().getInt("score5");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_final_score);

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();

        TextView score = findViewById(R.id.textView);
        score.setText(scoreFinal+"/5");
    }
}
