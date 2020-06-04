package com.example.workvesion.dormitory;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DormitoryA extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dormitory_a);
        toolbar = findViewById(R.id.toolbar45);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_dormitory_text_a_1 = findViewById(R.id.tv_dormitory_a_0 );
        tv_dormitory_text_a_1.setLinksClickable(true);
        tv_dormitory_text_a_1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tv_dormitory_d = findViewById(R.id.tv_dormitory_a_3);
        tv_dormitory_d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
            @Override
            public void onClick(View v) {
                StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
                StrictMode.setVmPolicy(builder.build());
                builder.detectFileUriExposure();
                LoadPdfFile("Zayavlenie_na_obschezhitie");
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private static final String AUTHORITY="REPLACE_IT_WITH_PACKAGE_NAME";

    static private void copy(InputStream in, File dst) throws IOException {
        FileOutputStream out=new FileOutputStream(dst);
        byte[] buf=new byte[1024];
        int len;

        while ((len=in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }

        in.close();
        out.close();
    }

    private  void LoadPdfFile(String fileName){

        File f = new File(getFilesDir(), fileName + ".doc");

        if (!f.exists()) {
            AssetManager assets=getAssets();

            try {
                copy(assets.open(fileName + ".doc"), f);
            }
            catch (IOException e) {
                Log.e("FileProvider", "Exception copying from assets", e);
            }
        }

        Intent i=
                new Intent(Intent.ACTION_VIEW,
                        FileProvider.getUriForFile(this, AUTHORITY, f));

        i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        startActivity(i);
        finish();
    }
}
