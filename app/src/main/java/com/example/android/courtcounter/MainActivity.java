package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreTeamA += score;
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void threePointerTeamA(View view) {
        displayTeamA(3);
    }

    public void twoPointerTeamA(View view) {
        displayTeamA(2);
    }

    public void freeThrowTeamA(View view) {
        displayTeamA(1);
    }
}
