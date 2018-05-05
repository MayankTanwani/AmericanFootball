package com.example.mayank.americanfootball;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvRedScore;
    TextView tvBlueScore;
    public static final int COLOR_RED = -48060;
    public static final int COLOR_BLUE = -16777216;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tvRedScore = findViewById(R.id.tv_red_score);
        tvBlueScore = findViewById(R.id.tv_blue_score);
        setContentView(R.layout.activity_main);
    }

    public void addPoints(View view) {
        int points = Integer.parseInt(((TextView)view).getText().toString().substring(1,2));
        int color = ((TextView) view).getCurrentTextColor();
        Log.d("Mayank : ", "addPoints: " + color + "  " + points);
        if(color == COLOR_RED) {
            int curr = Integer.parseInt(tvRedScore.getText().toString());
            curr += points;
            tvRedScore.setText(String.valueOf(curr));
        }else {
            int curr = Integer.parseInt(tvBlueScore.getText().toString());
            curr += points;
            tvBlueScore.setText(String.valueOf(curr));
        }
    }

    public void resetAll(View view) {
        tvRedScore.setText("0");
        tvBlueScore.setText("0");
    }
}
