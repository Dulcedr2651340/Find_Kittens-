package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.Api.RetrofitService;
import com.example.myapplication2.Api.Service.BreedsServices;
import com.example.myapplication2.Api.Service.CategoriesServices;
import com.example.myapplication2.adapter.BreedsAdapter;
import com.example.myapplication2.adapter.CategoriesAdapter;
import com.example.myapplication2.model.Breeds;
import com.example.myapplication2.model.Categories;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuCatFragment extends Fragment {

    RecyclerView popular_recycler;
    RecyclerView asia_recycler;
    BreedsAdapter breedsAdapter;
    CategoriesAdapter categoriesAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parent, Bundle Savedstatecinstantece){
        View view = inflater.inflate(R.layout.fragment_menu_cat, parent, false);
        popular_recycler = view.findViewById(R.id.popular_recycler);
        asia_recycler = view.findViewById(R.id.asia_recycler);

        popular_recycler.setHasFixedSize(true);
        popular_recycler.setLayoutManager(new GridLayoutManager(getContext(), 1, RecyclerView.HORIZONTAL, false));


        BreedsServices breedsServices = RetrofitService.getRetrofit().create(BreedsServices.class);
        Call<List<Breeds>> call = breedsServices.getBreeds();
        call.enqueue(new Callback<List<Breeds>>() {
            @Override
            public void onResponse(Call<List<Breeds>> call, Response<List<Breeds>> response) {
                if(response.isSuccessful()){

                    breedsAdapter = new BreedsAdapter(response.body(),MenuCatFragment.this);
                    popular_recycler.setAdapter(breedsAdapter);


                }
            }



            @Override
            public void onFailure(Call<List<Breeds>> call, Throwable t) {

                Toast.makeText(getContext(), "Error al conectar con el servicio", Toast.LENGTH_SHORT).show();
            }
        });


        getCategories();
        //BreedsAdapter breedsAdapter = new BreedsAdapter();
        return view;

    }

    public void getCategories(){

        CategoriesServices categoriesServices = RetrofitService.getRetrofit().create(CategoriesServices.class);
        Call<List<Categories>> call = categoriesServices.getCategories();
        call.enqueue(new Callback<List<Categories>>() {
            @Override
            public void onResponse(Call<List<Categories>> call, Response<List<Categories>> response) {
                asia_recycler.setLayoutManager(new GridLayoutManager(getContext(), 2, RecyclerView.HORIZONTAL, false));
                categoriesAdapter = new CategoriesAdapter(response.body(), MenuCatFragment.this);

                asia_recycler.setAdapter(categoriesAdapter);
            }

            @Override
            public void onFailure(Call<List<Categories>> call, Throwable t) {
                Toast.makeText(getContext(), "Error al conectar con el servicio", Toast.LENGTH_SHORT).show();

            }
        });

    }

}
