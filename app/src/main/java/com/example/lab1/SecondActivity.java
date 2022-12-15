package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.goBackBtn);
        Intent i = getIntent();
        String userName = i.getStringExtra("UserName");
        String age = i.getStringExtra("Age");
        TextView uName = findViewById(R.id.outputUserName);
        TextView uAge = findViewById(R.id.outputAge);
        uName.setText(userName);
        uAge.setText(age);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}