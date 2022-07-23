package com.mahmood.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int scoreTeamA=0;
        int scoreTeamB=0;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    public  void threePointsForA(View view){

        displayForTeamA(scoreTeamA=3+scoreTeamA);
    }
    public  void twoPointsForA(View view){
        displayForTeamA(scoreTeamA=2+scoreTeamA);
    }
    public  void freeThrowForA(View view){
        displayForTeamA(scoreTeamA=1+scoreTeamA);
    }

    public void resetButton(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



    public  void threePointsForB(View view){

        displayForTeamB(scoreTeamB=3+scoreTeamB);
    }
    public  void twoPointsForB(View view){
        displayForTeamB(scoreTeamB=2+scoreTeamB);
    }
    public  void freeThrowForB(View view){
        displayForTeamB(scoreTeamB=1+scoreTeamB);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    }

