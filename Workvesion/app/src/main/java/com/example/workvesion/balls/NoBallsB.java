package com.example.workvesion.balls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class NoBallsB extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_balls_b);
        toolbar = findViewById(R.id.toolbar39);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_no_balls_1 = findViewById(R.id.tv_no_balls_1);
        TextView tv_no_balls_2 = findViewById(R.id.tv_no_balls_2);
        TextView tv_no_balls_3 = findViewById(R.id.tv_no_balls_3);
        TextView tv_no_balls_4 = findViewById(R.id.tv_no_balls_4);
        TextView tv_no_balls_5 = findViewById(R.id.tv_no_balls_5);

        tv_no_balls_1.setOnClickListener(this);
        tv_no_balls_2.setOnClickListener(this);
        tv_no_balls_3.setOnClickListener(this);
        tv_no_balls_4.setOnClickListener(this);
        tv_no_balls_5.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_no_balls_1:
                startActivity(new Intent(this, NoBalls1.class));
                break;
            case R.id.tv_no_balls_2:
                startActivity(new Intent(this, NoBalls2.class));
                break;
            case R.id.tv_no_balls_3:
                startActivity(new Intent(this, NoBalls3.class));
                break;
            case R.id.tv_no_balls_4:
                startActivity(new Intent(this, NoBalls4.class));
                break;
            case R.id.tv_no_balls_5:
                startActivity(new Intent(this, NoBalls5.class));
                break;
        }
    }
}
