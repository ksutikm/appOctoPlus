package com.example.workvesion.education;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class Questions extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        toolbar = findViewById(R.id.toolbar21);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_question_a = findViewById(R.id.question_a);
        TextView tv_question_b = findViewById(R.id.question_b);

        tv_question_a.setOnClickListener(this);
        tv_question_b.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.question_a:
                startActivity(new Intent(this, QuestionA.class));
                break;
            case R.id.question_b:
                startActivity(new Intent(this, QuestionB.class));
                break;
        }
    }
}
