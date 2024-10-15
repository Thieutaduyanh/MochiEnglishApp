package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvResult;
    Button continueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        tvResult = findViewById(R.id.tv_result);
        continueBtn = findViewById(R.id.btn_continue);

        // Trong ResultActivity.java
        Intent receivedIntent = getIntent();
        // Nhận dữ liệu kiểu String
        String receivedString = receivedIntent.getStringExtra("keyString");
        if (receivedString != null) {
            tvResult.setText(receivedString);

            // luu ket qua bang sharedPreferences
            SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("result", receivedString);
            editor.apply();
        }
        continueBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == continueBtn) {
            Intent intent = new Intent(ResultActivity.this, TopicActivity.class);
            startActivity(intent);
            finish();
        }
    }
}


