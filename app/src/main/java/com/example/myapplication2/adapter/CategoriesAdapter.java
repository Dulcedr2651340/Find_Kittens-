package com.example.myapplication2.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.DeteilsCategoriesFragment;
import com.example.myapplication2.ImageRequester;
import com.example.myapplication2.NavigationHost;
import com.example.myapplication2.R;
import com.example.myapplication2.model.Categories;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesViewHolder>{

    public List<Categories> categoriesList;
    ImageRequester imageRequester;
    Fragment fragment;

    public CategoriesAdapter(List<Categories> categoriesList, Fragment fragment){

        imageRequester = ImageRequester.getInstance();
        this.categoriesList = categoriesList;
        this.fragment = fragment;

    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_details_categories, parent, false);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoriesViewHolder holder, int position){

        if(categoriesList != null && position < categoriesList.size()){
            Categories categories = categoriesList.get(position);
            holder.location_categories.setText(categories.getLocation());
            holder.name_cat_categories.setText(categories.getName_cat());
            holder.saved_categories.setText(""+categories.getSaved());
            holder.view_categories.setText(""+categories.getView());
            imageRequester.setImageFromUrl(holder.image_categories, categories.getImage_url());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("Id", categories.getId());
                    fragment.getParentFragmentManager().setFragmentResult("parants",bundle);
                    ((NavigationHost) fragment.getActivity()).navigateTo(new DeteilsCategoriesFragment(), true);
                }
            });
        }

    }

    @Override
    public int getItemCount(){
        return  categoriesList.size();
    }

}
