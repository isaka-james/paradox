/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.View
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.String
 */
package com.pacompany.paradox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity
extends Activity {
    private WebView webView;

    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
            return;
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903040);
        this.webView = (WebView)this.findViewById(2131099648);
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.loadUrl("http://www.google.com");
        this.webView.getSettings().setJavaScriptEnabled(true);
    }
}

