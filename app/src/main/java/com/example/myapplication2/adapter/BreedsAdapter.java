package com.example.myapplication2.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication2.DetailsBreedsFragment;
import com.example.myapplication2.DeteilsCategoriesFragment;
import com.example.myapplication2.ImageRequester;
import com.example.myapplication2.NavigationHost;
import com.example.myapplication2.R;
import com.example.myapplication2.model.Breeds;
import com.example.myapplication2.model.CatMiau;

import java.util.List;

public class BreedsAdapter extends RecyclerView.Adapter<BreedsViewHolder> {

    public List<Breeds> breedsList;
    ImageRequester imageRequester;

    Fragment fragment;


    public BreedsAdapter(List<Breeds> breedsList, Fragment fragment){

        imageRequester = ImageRequester.getInstance();
        this.breedsList = breedsList;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public BreedsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_details_breeds, parent, false);
        return new BreedsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BreedsViewHolder holder, int position){

        if(breedsList != null && position < breedsList.size()){
            Breeds breeds = breedsList.get(position);
          holder.name_breeds.setText(breeds.getName());
          holder.origin_breeds.setText(breeds.getOrigin());
          imageRequester.setImageFromUrl(holder.image_breeds, breeds.getImage_url());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("Id", breeds.getId());
                    fragment.getParentFragmentManager().setFragmentResult("parants",bundle);
                    ((NavigationHost) fragment.getActivity()).navigateTo(new DetailsBreedsFragment(), true);
                }
            });
        }

    }

    @Override
    public int getItemCount(){
        return breedsList.size();
    }



}
