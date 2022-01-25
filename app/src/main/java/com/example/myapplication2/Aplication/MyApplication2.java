package com.example.myapplication2.Aplication;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

public class MyApplication2 extends Application {

    private static MyApplication2 instance;
    private static Context appContext;

    public static MyApplication2 getInstance(){
        return instance;
    }

    public static Context getAppContext(){
        return appContext;
    }

    public void setAppContext(Context mAppContext){
        this.appContext = mAppContext;
    }

    @Override
    public void onCreate(){
        super.onCreate();

        instance = this;

        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

}
