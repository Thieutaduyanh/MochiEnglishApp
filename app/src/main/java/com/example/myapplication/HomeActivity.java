package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        // Sử dụng Handler để đặt thời gian đợi 1 giây (1000 milliseconds)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Tạo Intent để chuyển đến Activity mới
                Intent intent = new Intent(HomeActivity.this, TopicActivity.class);
                startActivity(intent);

                // Đảm bảo Activity hiện tại không còn tồn tại trên ngăn xếp
                finish();
            }
        }, 3000); // 1000 milliseconds = 1 giây
    }
}
