/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.pacompany.paradox;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.pacompany.paradox.MainActivity;

public class SplashActivity
extends Activity {
    Handler handler;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903041);
        this.handler = new Handler();
        this.handler.postDelayed(new Runnable(){

            public void run() {
                Intent intent = new Intent((Context)SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, 3000L);
    }

}

