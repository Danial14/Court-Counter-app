package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreOfTeaM_A;
    private int scoreOfTeaM_B;
    private TextView scoreDisplayerOfTeaM_A;
    private TextView scoreDisplayerOfTeaM_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreDisplayerOfTeaM_A = (TextView) findViewById(R.id.teaM_A_score);
        scoreDisplayerOfTeaM_B = (TextView) findViewById(R.id.teaM_B_score);
    }
    public void updateScoreForTeaMA(View view){
        switch (view.getId()){
            case R.id.teaM_A_1_point :
                scoreOfTeaM_A += 1;
                break;
            case R.id.teaM_A_2_points :
                scoreOfTeaM_A += 2;
                break;
            case R.id.teaM_A_3_points :
                scoreOfTeaM_A += 3;
                break;
        }
        displayScoreForTeaMA();
    }
    public void updateScoreForTeaMB(View view){
        switch(view.getId()){
            case R.id.teaM_B_1_point :
                scoreOfTeaM_B++;
                break;
            case R.id.teaM_B_2_points :
                scoreOfTeaM_B += 2;
                break;
            case R.id.teaM_B_3_points :
                scoreOfTeaM_B += 3;
                break;
        }
        displayScoreForTeaMB();
    }
    public void resetScore(View view){
        scoreOfTeaM_A = 0;
        scoreOfTeaM_B = 0;
        displayScoreForTeaMA();
        displayScoreForTeaMB();
    }
    private void displayScoreForTeaMA(){
        scoreDisplayerOfTeaM_A.setText(String.valueOf(scoreOfTeaM_A));
    }
    private void displayScoreForTeaMB(){
        scoreDisplayerOfTeaM_B.setText(String.valueOf(scoreOfTeaM_B));
    }
}
