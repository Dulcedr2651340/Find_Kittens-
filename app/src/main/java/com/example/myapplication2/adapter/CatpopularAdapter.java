package com.example.myapplication2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.DetailsActivity;
import com.example.myapplication2.R;
import com.example.myapplication2.model.CatPopular;

import java.util.List;

public class CatpopularAdapter extends RecyclerView.Adapter<CatPopularViewHolder> {

    Context context;
    List<CatPopular> catPopularList;

    public CatpopularAdapter(Context context, List<CatPopular> catPopularList){
        this.context = context;
        this.catPopularList = catPopularList;
    }

    @NonNull
    @Override
    public CatPopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_details_categories, parent, false);
        return new CatPopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatPopularViewHolder holder, int position){

        if(catPopularList != null && position < catPopularList.size()){
            CatPopular catPopular = catPopularList.get(position);
            holder.cat_popular_image.setImageResource(catPopular.getPopular_imageUrl());
            holder.cat_popular_name.setText(catPopular.getPopular_name());
            holder.cat_popular_description.setText(catPopular.getPopular_description());
            holder.rating.setText(catPopular.getRating());
            holder.view.setText(catPopular.getView());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context, DetailsActivity.class);
                    context.startActivity(i);
                }
            });
        }

    }
    @Override
    public int getItemCount() {
        return catPopularList.size();
    }




}
