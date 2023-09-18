package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weightEdt = findViewById(R.id.weight);
        EditText heightEdt = findViewById(R.id.height);
        Button convertBtn = findViewById(R.id.done);
        TextView result = findViewById(R.id.bmi);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float weight = Float.parseFloat(String.valueOf(weightEdt.getText())) /100;
                float height = Float.parseFloat(String.valueOf(heightEdt.getText()));
                float bmi = weight/(height * height);
                result.setText(String.valueOf(bmi));
            }
        });

    }
}