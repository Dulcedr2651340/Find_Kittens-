package com.example.myapplication2.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;
import com.example.myapplication2.R;

public class BreedsViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView image_breeds;
    public TextView  name_breeds;
    public TextView  origin_breeds;

    public BreedsViewHolder(@NonNull View itemView) {
        super(itemView);

        image_breeds = itemView.findViewById(R.id.image_breeds);
        name_breeds = itemView.findViewById(R.id.name_breeds);
        origin_breeds = itemView.findViewById(R.id.origin_breeds);
    }
}
