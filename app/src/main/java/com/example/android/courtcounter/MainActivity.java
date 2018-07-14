package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void twoPointsA(View view){
        scoreA+=2;
        displayA(scoreA);

    }
    public void threePointsA(View view){
       scoreA+=3;
       displayA(scoreA);
    }
    public void onePointA(View view){
       scoreA+=1;
       displayA(scoreA);
    }
    public void twoPointsB(View view){
        scoreB+=2;
        displayB(scoreB);

    }
    public void threePointsB(View view){
        scoreB+=3;
        displayB(scoreB);
    }
    public void onePointB(View view){
        scoreB+=1;
        displayB(scoreB);
    }
    public void eraseScore(View view){
        scoreB=0;scoreA=0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayA(int n){
        TextView points= (TextView) findViewById(R.id.team_scoreA);
        points.setText(String.valueOf(n));
    }
    private void displayB(int n){
        TextView points= (TextView) findViewById(R.id.team_scoreB);
        points.setText(String.valueOf(n));
    }
}
