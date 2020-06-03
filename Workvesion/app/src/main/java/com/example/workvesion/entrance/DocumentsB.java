package com.example.workvesion.entrance;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;

import com.example.workvesion.R;

import java.io.File;

public class DocumentsB extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents_b);
        toolbar = findViewById(R.id.toolbar29);setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_documents_text_b = findViewById(R.id.documents_text_b);
        tv_documents_text_b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
            @Override
            public void onClick(View v) {

                StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
                StrictMode.setVmPolicy(builder.build());
                builder.detectFileUriExposure();

                Intent intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.setAction(Intent.ACTION_VIEW);
                String type = "application/msword";
                intent.setDataAndType(Uri.fromFile(new File("Pamyatka_priem_na_tselevoe_obuchenie_v_ramkakh_kvoty_priema_na_tselevoe_obuchenie.doc")), type);
                startActivity(intent);

//                Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
//                File file = new File("Pamyatka_priem_na_tselevoe_obuchenie_v_ramkakh_kvoty_priema_na_tselevoe_obuchenie.doc");
//                String extension = android.webkit.MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
//                String mimetype = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
//                if (extension.equalsIgnoreCase("") || mimetype == null) {
//                    // if there is no extension or there is no definite mimetype, still try to open the file
//                    intent.setDataAndType(Uri.fromFile(file), "text/*");
//                } else {
//                    intent.setDataAndType(Uri.fromFile(file), mimetype);
//                }
//                // custom message for the intent
//                startActivity(Intent.createChooser(intent, "Choose an Application:"));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
