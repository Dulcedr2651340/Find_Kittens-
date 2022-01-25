package com.example.myapplication2.Api.Service;
import com.example.myapplication2.model.Favourites;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FavouritesServices {

    @GET("favourites")
    Call<List<Favourites>> getFavourites();

    @GET("favourites/{id}")
    Call<Favourites> getFavouritesById(@Path("id") Integer id);
}
