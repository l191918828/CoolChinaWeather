package com.example.coolweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class MyApplicattion extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePal.initialize(context);
        super.onCreate();
    }

    public static Context getContext(){
        return context;
    }
}
