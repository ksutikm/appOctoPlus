package com.example.workvesion.balls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;
import com.example.workvesion.entrance.DocumentsA;
import com.example.workvesion.entrance.DocumentsB;

public class Balls extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balls);
        toolbar = findViewById(R.id.toolbar33);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_balls_a = findViewById(R.id.tv_balls_a);
        TextView tv_balls_b = findViewById(R.id.tv_balls_b);
        TextView tv_balls_c = findViewById(R.id.tv_balls_c);

        tv_balls_a.setOnClickListener(this);
        tv_balls_b.setOnClickListener(this);
        tv_balls_c.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_balls_a:
                startActivity(new Intent(this, BallsA.class));
                break;
            case R.id.tv_balls_b:
                startActivity(new Intent(this, BallsB.class));
                break;
            case R.id.tv_balls_c:
                startActivity(new Intent(this, BallsC.class));
                break;
        }
    }
}
