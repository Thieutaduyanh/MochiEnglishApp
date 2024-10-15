package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TopicActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView school, stationery, subject;
    ImageView history;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);
        history = findViewById(R.id.history_icon);
        school = findViewById(R.id.img_school);
        stationery = findViewById(R.id.img_stationery);
        subject = findViewById(R.id.img_subject);
        school.setOnClickListener(this);
        stationery.setOnClickListener(this);
        subject.setOnClickListener(this);
        history.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String id;
        if(v == school) {
            Intent intent = new Intent(TopicActivity.this, MainActivity.class);
            id = "1";
            intent.putExtra("topicId", id);
            startActivity(intent);
            finish();
        } else if(v == stationery) {
            Intent intent = new Intent(TopicActivity.this, MainActivity.class);
            id = "2";
            intent.putExtra("topicId", id);
            startActivity(intent);
            finish();
        } else if(v == subject) {
            Intent intent = new Intent(TopicActivity.this, MainActivity.class);
            id = "3";
            intent.putExtra("topicId", id);
            startActivity(intent);
            finish();
        } else if(v == history) {
            Intent intent = new Intent(TopicActivity.this, CurrentScoreActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
