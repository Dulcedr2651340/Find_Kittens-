package com.example.myapplication2.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;
import com.example.myapplication2.R;

public class CategoriesViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView image_categories;
    public TextView location_categories;
    public TextView name_cat_categories;
    public TextView saved_categories;
    public TextView view_categories;
    public TextView description_lits_categories;


    public CategoriesViewHolder(@NonNull View itemView){
        super(itemView);

        image_categories = itemView.findViewById(R.id.image_categories);
        location_categories = itemView.findViewById(R.id.location_categories);
        name_cat_categories = itemView.findViewById(R.id.name_cat_categories);
        saved_categories = itemView.findViewById(R.id.saved_categories);
        view_categories = itemView.findViewById(R.id.view_categories);
        description_lits_categories = itemView.findViewById(R.id.description_lits_categories);

    }
}
