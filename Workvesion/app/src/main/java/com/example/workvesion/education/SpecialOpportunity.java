package com.example.workvesion.education;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class SpecialOpportunity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_opportunity);
        toolbar = findViewById(R.id.toolbar10);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_s_o_a = findViewById(R.id.s_o_a);
        TextView tv_s_o_b = findViewById(R.id.s_o_b);
        TextView tv_s_o_c = findViewById(R.id.s_o_c);

        tv_s_o_a.setOnClickListener(this);
        tv_s_o_b.setOnClickListener(this);
        tv_s_o_c.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.s_o_a:
                startActivity(new Intent(this, SOA.class));
                break;
            case R.id.s_o_b:
                startActivity(new Intent(this, SOB.class));
                break;
            case R.id.s_o_c:
                startActivity(new Intent(this, SOC.class));
                break;
        }
    }
}
