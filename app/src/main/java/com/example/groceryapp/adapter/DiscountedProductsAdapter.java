package com.example.groceryapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.R;
import com.example.groceryapp.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class DiscountedProductsAdapter extends RecyclerView.Adapter<DiscountedProductsAdapter.DiscountedProductViewHolder> {
    Context context;
    ArrayList<DiscountedProducts> discountedProductsList;


    public DiscountedProductsAdapter(Context context, List<DiscountedProducts> dataList) {
        this.context = context;
        this.discountedProductsList = new ArrayList<>(dataList);
        ;

    }


    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_items, parent, false);
        return new DiscountedProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {
        holder.discountImageView.setImageResource(discountedProductsList.get(position).getImageurl());
    }

    @Override
    public int getItemCount() {
        return discountedProductsList != null ? discountedProductsList.size() : 0; // Handle potential null list
    }


    public static class DiscountedProductViewHolder extends RecyclerView.ViewHolder {

        ImageView discountImageView;

        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);

            discountImageView = itemView.findViewById(R.id.discountImage);

        }
    }
}


