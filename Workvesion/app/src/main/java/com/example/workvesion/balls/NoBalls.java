package com.example.workvesion.balls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class NoBalls extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_balls);
        toolbar = findViewById(R.id.toolbar37);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_no_balls_a = findViewById(R.id.tv_no_balls_a);
        TextView tv_no_balls_b = findViewById(R.id.tv_no_balls_b);

        tv_no_balls_a.setOnClickListener(this);
        tv_no_balls_b.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_no_balls_a:
                startActivity(new Intent(this, BallsA.class));
                break;
            case R.id.tv_no_balls_b:
                startActivity(new Intent(this, BallsB.class));
                break;
        }
    }
}
