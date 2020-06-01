package com.example.workvesion.useful;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;
import com.example.workvesion.balls.NoBalls1;
import com.example.workvesion.balls.NoBalls2;
import com.example.workvesion.balls.NoBalls3;
import com.example.workvesion.balls.NoBalls4;
import com.example.workvesion.balls.NoBalls5;

public class UsefulC extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_c);
        toolbar = findViewById(R.id.toolbar50);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_useful_1 = findViewById(R.id.tv_useful_c_1);
        TextView tv_useful_2 = findViewById(R.id.tv_useful_c_2);

        tv_useful_1.setOnClickListener(this);
        tv_useful_2.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_useful_c_1:
                startActivity(new Intent(this, UsefulC1.class));
                break;
            case R.id.tv_useful_c_2:
                startActivity(new Intent(this, UsefulC2.class));
                break;
        }
    }
}
