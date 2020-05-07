package com.example.workvesion.education;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class Transfer extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        toolbar = findViewById(R.id.toolbar14);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_transfer_a = findViewById(R.id.transfer_a);
        TextView tv_transfer_b = findViewById(R.id.transfer_b);
        TextView tv_transfer_c = findViewById(R.id.transfer_c);

        tv_transfer_a.setOnClickListener(this);
        tv_transfer_b.setOnClickListener(this);
        tv_transfer_c.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.transfer_a:
                startActivity(new Intent(this, TransferA.class));
                break;
            case R.id.transfer_b:
                startActivity(new Intent(this, TransferB.class));
                break;
            case R.id.transfer_c:
                startActivity(new Intent(this, TransferC.class));
                break;
        }
    }
}
