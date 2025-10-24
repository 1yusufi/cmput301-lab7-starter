package com.example.androiduitesting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CityActivity extends AppCompatActivity {

    TextView cityTextView;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        cityTextView = findViewById(R.id.city_text_view);
        backBtn = findViewById(R.id.back_btn);

        String cityName = getIntent().getStringExtra("city");
        cityTextView.setText(cityName);

        backBtn.setOnClickListener(v -> {
            finish();
        });

    }
}