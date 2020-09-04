package com.example.explictintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView learn, dangi;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        learn = findViewById(R.id.learn);
        dangi = findViewById(R.id.dangi);

        Intent intent = getIntent();
        data =intent.getStringExtra("dataname");
        learn.setText("Best Android Tutorial by " +data);
        dangi.setText("Learn with " +data);
    }
}