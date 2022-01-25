package com.example.myapplication2.Api.Service;

import com.example.myapplication2.model.Breeds;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BreedsServices {

    @GET("breeds")
    Call<List<Breeds>> getBreeds();

    @GET("breeds/{id}")
    Call<Breeds> getBreedsById(@Path("id") Integer id);
}
