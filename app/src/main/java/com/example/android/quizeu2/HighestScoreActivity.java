package com.example.android.quizeu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        //cast views into objects
        TextView currentScore = (TextView) findViewById(R.id.scoreTextView);
        TextView highestScore = (TextView) findViewById(R.id.highestScoreTextView);

        //receive data from intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score",0);

        //display current score
        currentScore.setText("Your score: " + score);
        highestScore.setText("Max Score: 4");

    }

}
