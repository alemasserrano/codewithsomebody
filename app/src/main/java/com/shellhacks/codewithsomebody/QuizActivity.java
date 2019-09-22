package com.shellhacks.codewithsomebody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shellhacks.codewithsomebody.ui.login.LoginActivity;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final Button nextButton = findViewById(R.id.next);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizActivity.this, Calendar.class));
            }
        });
        getGender();
        getEducation();
        getProgrammingLevel();
        getObjective();
        getProgrammingLanguages();
        getCompanies();
    }

    private void getGender(){
        final Button Female = findViewById(R.id.female);
        final Button Male = findViewById(R.id.male);
        final Button Nonbinary = findViewById(R.id.nonbinary);

        Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Male.setEnabled(false);
                Nonbinary.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Female.setEnabled(false);
                Nonbinary.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Nonbinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Male.setEnabled(false);
                Female.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });

    }

    private void getEducation(){
        final Button Undergrad = findViewById(R.id.undergrad);
        final Button Grad = findViewById(R.id.graduate);
        final Button Other = findViewById(R.id.other);

        Undergrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Grad.setEnabled(false);
                Other.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Grad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Undergrad.setEnabled(false);
                Other.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Undergrad.setEnabled(false);
                Grad.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
    }

    private void getProgrammingLevel(){
        final Button Beginner = findViewById(R.id.beginner);
        final Button Intermediate = findViewById(R.id.intermediate);
        final Button Advanced = findViewById(R.id.advanced);
        final Button Expert = findViewById(R.id.expert);

        Beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intermediate.setEnabled(false);
                Advanced.setEnabled(false);
                Expert.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Beginner.setEnabled(false);
                Advanced.setEnabled(false);
                Expert.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Beginner.setEnabled(false);
                Intermediate.setEnabled(false);
                Expert.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Beginner.setEnabled(false);
                Advanced.setEnabled(false);
                Intermediate.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
    }

    private void getObjective(){
        final Button DS = findViewById(R.id.data_structures);
        final Button PM = findViewById(R.id.product_managemnet);
        final Button Behavioral = findViewById(R.id.behavioral);
        final Button SD = findViewById(R.id.system_design);
        final Button FE = findViewById(R.id.front_end);
        final Button DataScience = findViewById(R.id.data_science);


        DS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        PM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Behavioral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        SD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        FE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        DataScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
    }

    private void getProgrammingLanguages(){
        final Button Java = findViewById(R.id.java);
        final Button C = findViewById(R.id.c);
        final Button Cpp = findViewById(R.id.cpp);
        final Button Csharp = findViewById(R.id.csharp);
        final Button Php = findViewById(R.id.php);
        final Button Python = findViewById(R.id.python);
        final Button Javascript = findViewById(R.id.javascript);


        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
    }

    private void getCompanies() {
        final Button Apple = findViewById(R.id.apple);
        final Button Amazon = findViewById(R.id.amazon);
        final Button Facebook = findViewById(R.id.facebook);
        final Button Google = findViewById(R.id.google);
        final Button JPM = findViewById(R.id.chase);
        final Button Square = findViewById(R.id.square);
        final Button Uber = findViewById(R.id.uber);
        final Button Other = findViewById(R.id.other_company);


        Apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        JPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
    }
}
