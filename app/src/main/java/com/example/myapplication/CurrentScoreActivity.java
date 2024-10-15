package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CurrentScoreActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView learn;
    TextView currentScore;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        learn = findViewById(R.id.learn_icon);
        currentScore = findViewById(R.id.tv_current_score);
        learn.setOnClickListener(this);

        // truy xuat diem da luu
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String resultValue = preferences.getString("result", "defaultValue");

        currentScore.setText(resultValue);

    }
    @Override
    public void onClick(View v) {
        if(v == learn) {
            Intent intent = new Intent(CurrentScoreActivity.this, TopicActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
