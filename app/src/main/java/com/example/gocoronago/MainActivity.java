package com.example.gocoronago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void seeNews(View view)
    {
        if(isNetworkAvailable())
        {
            Intent intent = new Intent(this,NewsActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Please check your internet connection",Toast.LENGTH_SHORT).show();
        }
    }

    public void seegovtsite(View view)
    {
        if(isNetworkAvailable())
        {
            Intent intent = new Intent(this,Govtguidelines.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Please check your internet connection",Toast.LENGTH_SHORT).show();
        }
    }

    public void safety(View view)
    {
        Intent intent = new Intent(this,SafetyActivity.class);
        startActivity(intent);
    }

    public void aboutshow(View view)
    {
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }

    public void covidInfo(View view)
    {
        Intent intent = new Intent(this,CovidInfo.class);
        startActivity(intent);
    }

    public void showrumours(View view)
    {
        Intent intent = new Intent(this,RumourActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
