package com.example.gocoronago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.google.com/search?sxsrf=ALeKk02p97Glger15uwpSQ4lDqXVdr6tCg%3A1586945307542&source=hp&ei=G92WXq7cGajbz7sPw6ymoAI&q=latest+corona+news+in+india&oq=latest+corona+news&gs_lcp=CgZwc3ktYWIQARgBMgUIABCDATICCAAyBQgAEIMBMgUIABCDATIFCAAQgwEyBQgAEIMBMgIIADICCAAyBQgAEIMBMgIIADoFCAAQkQI6BAgAEApKMQgXEi0wZzM0MmczNzRnMjMzZzI0NmcyMTNnMTk0ZzE5NGcxOTFnMjQyZzE5OGcyMTJKGwgYEhcwZzFnMWcxZzFnMWcxZzFnMWcxZzVnNFC4SViuY2DDgQFoAXAAeACAAeYCiAGVHpIBBzAuOS43LjKYAQCgAQGqAQdnd3Mtd2l6&sclient=psy-ab");

    }
}
