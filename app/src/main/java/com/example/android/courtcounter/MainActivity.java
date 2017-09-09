package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
    display the updated score for team A with this method
    * */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA += score;
        scoreView.setText(String.valueOf(scoreTeamA));

    }

    /*
    display the updated score for team B with this method
    * */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreTeamB += score;
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /*
    Add 3 points to team A's score with this method
    * */
    public void addThreeForTeamA(View view) {
        displayForTeamA(3);
    }

    /*
        Add 2 points to team A's score with this method
        * */
    public void addTwoForTeamA(View view) {
        displayForTeamA(2);
    }

    /*
    Add 2 points to team A's score with this method
    * */
    public void addOneForTeamA(View view) {
        displayForTeamA(1);
    }

    /*
    Add 3 points to team B's score with this method
    * */
    public void addThreeForTeamB(View view) {
        displayForTeamA(3);
    }

    /*
        Add 2 points to team B's score with this method
        * */
    public void addTwoForTeamB(View view) {
        displayForTeamA(2);
    }

    /*
    Add 2 points to team B's score with this method
    * */
    public void addOneForTeamB(View view) {
        displayForTeamA(1);
    }
}
