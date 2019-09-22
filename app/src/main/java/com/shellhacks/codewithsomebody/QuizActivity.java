package com.shellhacks.codewithsomebody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final Button loginButton = findViewById(R.id.register);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

            }
        });

    }
}
