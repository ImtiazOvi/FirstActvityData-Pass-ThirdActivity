package com.example.getextraputextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.secondTextView);
        button = findViewById(R.id.secondBtn);
        final Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        //textView2.setText(name2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this,ThirdActivity.class);
                intent1.putExtra("name2",name);
                startActivity(intent1);
            }
        });
    }
}
