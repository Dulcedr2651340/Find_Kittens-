package com.example.myapplication2.Api.Service;
import com.example.myapplication2.model.Categories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CategoriesServices {

    @GET("categories")
    Call<List<Categories>> getCategories();

    @GET("categories/{id}")
    Call<Categories> getCategoriesById(@Path("id") Integer id);
}
