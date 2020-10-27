package com.ashish.drmps;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class admission extends Fragment {

    public final String Mock_browser = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
    ProgressBar progressBar;
    Dialog popup_no_internet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        popup_no_internet = new Dialog(getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_admission, container, false);

        if(isConnected()){

            WebView webView = view.findViewById(R.id.webview);
            progressBar = view.findViewById(R.id.progressBar);

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

            webView.getSettings().setUserAgentString(Mock_browser);
            String url = "https://docs.google.com/forms/d/e/1FAIpQLSfKK9tWuYRHtJCbrt4f3o6q4PSX1bwe3O5jn7IPNP1Iwi-lFw/viewform";
            webView.loadUrl(url);
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

            closeBtn.setVisibility(View.INVISIBLE);

            retryBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.detach(admission.this).attach(admission.this).commit();
                    if(isConnected()){
                        popup_no_internet.dismiss();
                    }
                }
            });
            popup_no_internet.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Window window = popup_no_internet.getWindow();
            popup_no_internet.setCanceledOnTouchOutside(false);
            window.setGravity(Gravity.CENTER);
            popup_no_internet.show();
        }

        return view;
    }

    public boolean isConnected() {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }


}