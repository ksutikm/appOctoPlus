package com.example.workvesion.education;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class Attestation extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attestation);
        toolbar = findViewById(R.id.toolbar17);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_attestation_a = findViewById(R.id.attestation_a);
        TextView tv_attestation_b = findViewById(R.id.attestation_b);

        tv_attestation_a.setOnClickListener(this);
        tv_attestation_b.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attestation_a:
                startActivity(new Intent(this, AttestationA.class));
                break;
            case R.id.attestation_b:
                startActivity(new Intent(this, AttestationB.class));
                break;
        }
    }
}
