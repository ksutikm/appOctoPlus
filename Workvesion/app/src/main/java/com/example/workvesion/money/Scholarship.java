package com.example.workvesion.money;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;
import com.example.workvesion.money.MoneyA;
import com.example.workvesion.money.MoneyB;
import com.example.workvesion.money.MoneyC;
import com.example.workvesion.money.MoneyD;
import com.example.workvesion.money.MoneyE;
import com.example.workvesion.money.MoneyF;
import com.example.workvesion.money.MoneyG;

public class Scholarship extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);
        toolbar = findViewById(R.id.toolbar9);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        TextView tv_money_a = findViewById(R.id.money_a);
        TextView tv_money_b = findViewById(R.id.pgas);
        TextView tv_money_c = findViewById(R.id.money_c);
        TextView tv_money_d = findViewById(R.id.money_d);
        TextView tv_money_e = findViewById(R.id.money_e);
        TextView tv_money_f = findViewById(R.id.money_f);
        TextView tv_money_g = findViewById(R.id.money_g);

        tv_money_b.setOnClickListener(this);
        tv_money_a.setOnClickListener(this);
        tv_money_c.setOnClickListener(this);
        tv_money_d.setOnClickListener(this);
        tv_money_e.setOnClickListener(this);
        tv_money_f.setOnClickListener(this);
        tv_money_g.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pgas:
                startActivity(new Intent(this, MoneyB.class));
                break;
            case R.id.money_a:
                startActivity(new Intent(this, MoneyA.class));
                break;
            case R.id.money_c:
                startActivity(new Intent(this, MoneyC.class));
                break;
            case R.id.money_d:
                startActivity(new Intent(this, MoneyD.class));
                break;
            case R.id.money_e:
                startActivity(new Intent(this, MoneyE.class));
                break;
            case R.id.money_f:
                startActivity(new Intent(this, MoneyF.class));
                break;
            case R.id.money_g:
                startActivity(new Intent(this, MoneyG.class));
                break;
        }
    }
}
