package com.example.workvesion.useful;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class UsefulA extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_a);
        toolbar = findViewById(R.id.toolbar48);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_useful_a_1 = findViewById(R.id.tv_useful_a_1);
        TextView tv_useful_a_2 = findViewById(R.id.tv_useful_a_2);
        TextView tv_useful_a_3 = findViewById(R.id.tv_useful_a_3);

        tv_useful_a_1.setOnClickListener(this);
        tv_useful_a_2.setOnClickListener(this);
        tv_useful_a_3.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_useful_a_1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/abiturientu-2020/dni-otkrytykh-dverey-2019-2020.php")));
                break;
            case R.id.tv_useful_a_2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/YarGUTV/videos")));
                break;
            case R.id.tv_useful_a_3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/yargutv")));
                break;
        }
    }
}
