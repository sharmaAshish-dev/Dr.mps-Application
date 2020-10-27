package com.ashish.drmps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class subject_webview extends AppCompatActivity {

    public final String Mock_browser = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
    ProgressBar progressBar;
    Dialog popup_no_internet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_webview);

        popup_no_internet = new Dialog(this);

        progressBar = findViewById(R.id.progressBar);

        WebView webView = findViewById(R.id.webview);


        if(isConnected()){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

            webView.getSettings().setUserAgentString(Mock_browser);
            String url = getIntent().getStringExtra("url");
            String website = getIntent().getStringExtra("website");
            if(url != null){
                webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);
            }
            else if(website != null)
            {
                webView.loadUrl(website);
            }
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                }

            });
        }
        else
        {
            TextView retryBtn,closeBtn;
            popup_no_internet.setContentView(R.layout.popup_no_internet);

            retryBtn = popup_no_internet.findViewById(R.id.RetryBtn);
            closeBtn = popup_no_internet.findViewById(R.id.closeBtn);

            closeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            retryBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(subject_webview.this, subject_webview.class);
                    finish();
                    overridePendingTransition(0, 0);
                    startActivity(i);
                    overridePendingTransition(0, 0);

                    if(isConnected()){
                        popup_no_internet.dismiss();
                    }
                }
            });
            popup_no_internet.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Window window = popup_no_internet.getWindow();
            window.setGravity(Gravity.CENTER);
            popup_no_internet.setCanceledOnTouchOutside(false);
            popup_no_internet.setCancelable(false);
            popup_no_internet.show();
        }

    }

    public boolean isConnected() {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }
}