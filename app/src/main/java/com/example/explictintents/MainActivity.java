package com.example.explictintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDangi;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDangi = findViewById(R.id.txtDangi);
        txtDangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = txtDangi.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dataname", data);
                startActivity(intent);
            }
        });
    }
}