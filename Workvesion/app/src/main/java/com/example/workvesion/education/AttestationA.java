package com.example.workvesion.education;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class AttestationA extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attestation_a);
        toolbar = findViewById(R.id.toolbar18);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_attestation_a_a = findViewById(R.id.attestation_a_a);
        TextView tv_attestation_a_b = findViewById(R.id.attestation_a_b);

        tv_attestation_a_a.setOnClickListener(this);
        tv_attestation_a_b.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attestation_a_a:
                startActivity(new Intent(this, AttestationAA.class));
                break;
            case R.id.attestation_a_b:
                startActivity(new Intent(this, AttestationAB.class));
                break;
        }
    }
}
