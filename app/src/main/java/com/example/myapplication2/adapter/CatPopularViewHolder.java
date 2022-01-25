package com.example.myapplication2.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.R;

public class CatPopularViewHolder extends RecyclerView.ViewHolder {

    public ImageView cat_popular_image;
    public TextView cat_popular_description;
    public TextView cat_popular_name;
    public TextView rating;
    public TextView view;

    public CatPopularViewHolder(@NonNull View itemView){
        super(itemView);

        cat_popular_image = itemView.findViewById(R.id.image_categories);
        cat_popular_description = itemView.findViewById(R.id.location_categories);
        cat_popular_name = itemView.findViewById(R.id.name_cat_categories);
        rating = itemView.findViewById(R.id.saved_categories);
        view = itemView.findViewById(R.id.view_categories);

    }
}
