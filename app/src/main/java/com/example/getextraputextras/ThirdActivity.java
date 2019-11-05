package com.example.getextraputextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView3 = findViewById(R.id.thirdTextView);
        Intent intent = getIntent();
        String name3 = intent.getStringExtra("name2");
        textView3.setText(name3);

    }
}
