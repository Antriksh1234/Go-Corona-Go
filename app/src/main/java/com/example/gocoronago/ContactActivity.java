package com.example.gocoronago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class ContactActivity extends AppCompatActivity {

    public void writeMail(View view)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "antrikshtelang1998@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your message");
        this.startActivity(Intent.createChooser(emailIntent, null));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
}
