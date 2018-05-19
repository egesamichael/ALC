package com.praisewebhosts.android.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int teamAGoal = 0;
    int teamACorner = 0;
    int teamBGoal = 0;
    int teamBCorner = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Method to Add 1 to current Goal Number

    public void addTeamAGoal(View view) {

        teamAGoal = teamAGoal + 1;

        goalTeamA(teamAGoal);

    }

    // Method to Add 1 to current Goal Number

    public void addTeamACorner(View view) {

        teamACorner = teamACorner + 1;

        cornerTeamA(teamACorner);

    }

    // Method to Add 1 to current Goal Number

    public void addTeamBGoal(View view) {

        teamBGoal = teamBGoal + 1;

        goalTeamB(teamBGoal);

    }

    // Method to Add 1 to current Goal Number

    public void addTeamBCorner(View view) {

        teamBCorner = teamBCorner + 1;

        cornerTeamB(teamBCorner);

    }


//Method to update the Goal Text View

    public void cornerTeamA(int corner) {
        TextView cornerForTeamA = (TextView) findViewById(R.id.corner_team_A);
        cornerForTeamA.setText("" + corner);


    }


//Method to update the Goal Text View

    public void goalTeamA(int goal) {
        TextView goalForTeamA = (TextView) findViewById(R.id.goal_team_A);
        goalForTeamA.setText("" + goal);


    }
//Method to update the Goal Text View

    public void cornerTeamB(int corner) {
        TextView cornerForTeamB = (TextView) findViewById(R.id.corner_team_B);
        cornerForTeamB.setText("" + corner);


    }


//Method to update the Goal Text View

    public void goalTeamB(int goal) {
        TextView goalForTeamA = (TextView) findViewById(R.id.goal_team_B);
        goalForTeamA.setText("" + goal);


    }

    public void reset(View view) {


        teamAGoal = 0;
        teamACorner = 0;
        teamBGoal = 0;
        teamBCorner = 0;

        goalTeamA(teamAGoal);
        cornerTeamA(teamACorner);
        goalTeamB(teamBGoal);
        cornerTeamB(teamBCorner);

    }


}
