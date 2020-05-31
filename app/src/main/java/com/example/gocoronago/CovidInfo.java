package com.example.gocoronago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CovidInfo extends AppCompatActivity {

    public void showChina(View view)
    {
        Intent intent = new Intent(this,ChinaActivty.class);
        startActivity(intent);
    }

    public void showwhysafety(View view)
    {
        Intent intent = new Intent(this,WhySafetyTips.class);
        startActivity(intent);
    }

    public void showcoivddetail(View view)
    {
        Intent intent = new Intent(this,whatisactuallycovid19.class);
        startActivity(intent);
    }

    public void showdiff(View view)
    {
        Intent intent = new Intent(this,BacteriaVirusActivity.class);
        startActivity(intent);
    }

    public void showvirusInfo(View view)
    {
        Intent intent = new Intent(this,WhatIsVirusActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_info);
    }
}
