package com.example.workvesion.useful;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

public class UsefulC1 extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_c_1);
        toolbar = findViewById(R.id.toolbar51);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_useful_text_c_1_2 = findViewById(R.id.tv_useful_c_1_1);
        TextView tv_useful_text_c_1_3 = findViewById(R.id.tv_useful_c_1_2);
        TextView tv_useful_text_c_1_4 = findViewById(R.id.tv_useful_c_1_3);

        tv_useful_text_c_1_2.setOnClickListener(this);
        tv_useful_text_c_1_3.setOnClickListener(this);
        tv_useful_text_c_1_4.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_useful_c_1_1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/abiturientu-2020/voskresnye-kursy/voskresnyy-lektoriy-fakulteta-biologii-i-ekologii.php")));
                break;
            case R.id.tv_useful_c_1_2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniyar.ac.ru/Abitur/abiturientu-2020/voskresnye-kursy/voskresnyy-lektoriy-po-angliyskomu-yazyku.php")));
                break;
            case R.id.tv_useful_c_1_3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://ivt.uniyar.ac.ru/entrant/preparation")));
                break;
        }
    }
}
