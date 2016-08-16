package com.m4uevents.uashraf.m4uevents;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by uashraf on 8/11/16.
 */


    public class MyAppWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if(Uri.parse(url).getHost().endsWith("m4uevents.com")) {
                return false;
            }

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            view.getContext().startActivity(intent);
            return true;



           // WebView mWebView = (WebView) findViewById(R.id.activity_main_webview);
            //mWebView.setWebViewClient(new MyAppWebViewClient());

        }


    }

