package com.example.workvesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_enter;
    Button bnt_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enter = (Button) findViewById(R.id.bnt_enter);
        bnt_registration = (Button) findViewById(R.id.bnt_registration);
        btn_enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bnt_enter:
                startActivity(new Intent(this, NavigationLeft.class));
                break;
        }
    }
}
