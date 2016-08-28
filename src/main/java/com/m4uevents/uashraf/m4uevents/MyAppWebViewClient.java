package com.m4uevents.uashraf.m4uevents;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by uashraf on 8/11/16.
 */


    public class MyAppWebViewClient extends WebViewClient {

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Log.d("Url is:", url);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        if (url.startsWith("tel:")) {
            new Intent(Intent.ACTION_DIAL, Uri.parse(url));
            return true;
        } else if (url.startsWith("mailto:")) {
            new Intent(Intent.ACTION_SEND, Uri.parse(url));
            return true;
        } else if (url.startsWith("http://www.m4uevents.com")) {
            Log.d("Url is:", url);
            return true;

        }
        return false;
    }


    }



       /* public boolean shouldOverrideDialerLoading(WebView view, String dial) {
            Log.d("Url is:",dial);


            if (dial.startsWith("tel:")) {
                return false;
            }
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(dial));
                //Intent.ACTION_VIEW, Uri.parse(url);
                view.getContext().startActivity(intent);
                //(Uri.parse(url).getHost().endsWith("m4uevents.com"));


            return true;
        }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url, String dial) {
        Log.d("Url is:", url);

        if (Uri.parse(url).getHost().equals("www.m4uevents.com") || (dial.startsWith("tel:"))) {
            // Designate Urls that you want to load in WebView still.
            return false;
        }
        // Otherwise, give the default behavior (open in browser)
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(dial));
        new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        return true;
    }




            /*if(Uri.parse(url).getHost().endsWith("m4uevents.com")) {
                return false;
            }*/

       /*     Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            view.getContext().startActivity(intent);
        }
            return true;*/



           // WebView mWebView = (WebView) findViewById(R.id.activity_main_webview);
            //mWebView.setWebViewClient(new MyAppWebViewClient());






