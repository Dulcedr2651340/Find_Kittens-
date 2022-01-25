package com.example.myapplication2;

import android.Manifest;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeteilsCategoriesFragment extends Fragment {

    NetworkImageView image_lits;
    TextView view_lits;
    TextView saved_lits;
    TextView loveit_lits;
    TextView namecat_lits;
    TextView description_lits;
    TextView sv_lits;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parent, Bundle savedStateInstance){

        View view = inflater.inflate(R.layout.fragment_lits, parent, false);
        image_lits = view.findViewById(R.id.image_lits);
        view_lits = view.findViewById(R.id.view_lits);
        saved_lits = view.findViewById(R.id.loveit_lits);
        loveit_lits = view.findViewById(R.id.loveit_lits);

        namecat_lits = view.findViewById(R.id.namecat_lits);
        description_lits = view.findViewById(R.id.description_lits_categories);
        sv_lits = view.findViewById(R.id.sv_lits);

        BreedsServices breedsServices = RetrofitService.getRetrofit().create(BreedsServices.class);
        getParentFragmentManager().setFragmentResultListener("parants", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                Integer id = result.getInt("Id");
                getCategoriesById(id);
            }
        });

        return view;

    }


    public void getCategoriesById(Integer id){

        CategoriesServices categoriesServices = RetrofitService.getRetrofit().create(CategoriesServices.class);
        Call<Categories> call = categoriesServices.getCategoriesById(id);
        call.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {

                Categories categories = response.body();

                namecat_lits.setText(categories.getName_cat());
                view_lits.setText(categories.getView());
                saved_lits.setText(categories.getSaved());
                description_lits.setText(categories.getDescription());
                sv_lits.setText("0"+categories.getId());
                ImageRequester imageRequester = ImageRequester.getInstance();
                imageRequester.setImageFromUrl(image_lits, response.body().getImage_url());

            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {

            }
        });
    }



}
