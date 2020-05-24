package com.example.workvesion.entrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;
import com.example.workvesion.education.AttestationA;
import com.example.workvesion.education.AttestationB;

public class Documents extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);
        toolbar = findViewById(R.id.toolbar27);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_documents_a = findViewById(R.id.tv_documents_a);
        TextView tv_documents_b = findViewById(R.id.tv_documents_b);

        tv_documents_a.setOnClickListener(this);
        tv_documents_b.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_documents_a:
                startActivity(new Intent(this, DocumentsA.class));
                break;
            case R.id.tv_documents_b:
                startActivity(new Intent(this, DocumentsB.class));
                break;
        }
    }
}
