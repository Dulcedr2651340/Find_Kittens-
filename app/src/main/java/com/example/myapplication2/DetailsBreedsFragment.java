package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import com.android.volley.toolbox.NetworkImageView;
import com.example.myapplication2.Api.RetrofitService;
import com.example.myapplication2.Api.Service.BreedsServices;
import com.example.myapplication2.Api.Service.CategoriesServices;
import com.example.myapplication2.model.Breeds;
import com.example.myapplication2.model.Categories;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailsBreedsFragment extends Fragment {

    NetworkImageView image_breeds_dtls;
    TextView name_breeds_dlts;
    TextView life_span_breeds;
    TextView temperament_breeds;
    TextView origin_breeds_dlts;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parent, Bundle savedStateInstance){

        View view = inflater.inflate(R.layout.fragment_lits_breeds, parent, false);
        image_breeds_dtls = view.findViewById(R.id.image_breeds_dtls);
        name_breeds_dlts = view.findViewById(R.id.name_breeds_dlts);
        life_span_breeds = view.findViewById(R.id.life_span_breeds);
        temperament_breeds = view.findViewById(R.id.temperament_breeds);
        origin_breeds_dlts = view.findViewById(R.id.origin_breeds_dlts);

        BreedsServices breedsServices = RetrofitService.getRetrofit().create(BreedsServices.class);
        getParentFragmentManager().setFragmentResultListener("parants", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                Integer id = result.getInt("Id");
                getBreedsById(id);
            }
        });

        return view;

    }


    public void getBreedsById(Integer id) {

        BreedsServices breedsServices = RetrofitService.getRetrofit().create(BreedsServices.class);
        Call<Breeds> call = breedsServices.getBreedsById(id);
        call.enqueue(new Callback<Breeds>() {
            @Override
            public void onResponse(Call<Breeds> call, Response<Breeds> response) {

                Breeds breeds = response.body();

                name_breeds_dlts.setText(breeds.getName());
                life_span_breeds.setText(breeds.getLife_Span());
                temperament_breeds.setText(breeds.getTemperament());
                origin_breeds_dlts.setText(breeds.getOrigin());
                ImageRequester imageRequester = ImageRequester.getInstance();
                imageRequester.setImageFromUrl(image_breeds_dtls, breeds.getImage_url());

            }

            @Override
            public void onFailure(Call<Breeds> call, Throwable t) {

            }
        });

    }

}
