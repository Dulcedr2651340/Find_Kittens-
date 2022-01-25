package com.example.myapplication2.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    public static final String URL_001 = "http://192.168.0.105:3000";

    public static Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(URL_001).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

}
