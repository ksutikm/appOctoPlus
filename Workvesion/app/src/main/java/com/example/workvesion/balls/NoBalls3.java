package com.example.workvesion.balls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class NoBalls3 extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_balls_3);
        toolbar = findViewById(R.id.toolbar42);setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_no_balls_3_1 = findViewById(R.id.tv_no_balls_3_1);
        TextView tv_no_balls_3_2 = findViewById(R.id.tv_no_balls_3_2);
        TextView tv_no_balls_3_3 = findViewById(R.id.tv_no_balls_3_3);
        TextView tv_no_balls_3_4 = findViewById(R.id.tv_no_balls_3_4);
        TextView tv_no_balls_3_5 = findViewById(R.id.tv_no_balls_3_5);
        TextView tv_no_balls_3_6 = findViewById(R.id.tv_no_balls_3_6);
        TextView tv_no_balls_3_7 = findViewById(R.id.tv_no_balls_3_7);
        TextView tv_no_balls_3_8 = findViewById(R.id.tv_no_balls_3_8);
        TextView tv_no_balls_3_9 = findViewById(R.id.tv_no_balls_3_9);
        TextView tv_no_balls_3_10 = findViewById(R.id.tv_no_balls_3_10);
        TextView tv_no_balls_3_11 = findViewById(R.id.tv_no_balls_3_11);

        tv_no_balls_3_1.setOnClickListener(this);
        tv_no_balls_3_2.setOnClickListener(this);
        tv_no_balls_3_3.setOnClickListener(this);
        tv_no_balls_3_4.setOnClickListener(this);
        tv_no_balls_3_5.setOnClickListener(this);
        tv_no_balls_3_6.setOnClickListener(this);
        tv_no_balls_3_7.setOnClickListener(this);
        tv_no_balls_3_8.setOnClickListener(this);
        tv_no_balls_3_9.setOnClickListener(this);
        tv_no_balls_3_10.setOnClickListener(this);
        tv_no_balls_3_11.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_no_balls_3_1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_rus_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_math_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_lit_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_his_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_bio_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_6:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_chem_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_7:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_phys_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_8:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_obsh_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_9:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_inf_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_10:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_geo_2016.pdf")));
                break;
            case R.id.tv_no_balls_3_11:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/programmy-vstupitelnykh-ispytaniy-provodimykh-organizatsiey-samostoyatelno/Prog_eng_2016.pdf")));
                break;
        }
    }
}
