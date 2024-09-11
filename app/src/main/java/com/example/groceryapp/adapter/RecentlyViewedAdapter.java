package com.example.groceryapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

//import com.android.billingclient.api.ProductDetails;
import com.example.groceryapp.R;
import com.example.groceryapp.model.RecentlyViewed;
import com.example.groceryapp.ProductDetails;

import java.util.List;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.RecentlyViewedViewHolder> {
    Context context;
    List<RecentlyViewed> recentlyViewedList;

    public RecentlyViewedAdapter(Context context, List<RecentlyViewed> recentlyViewedList) {
        this.context = context;
        this.recentlyViewedList = recentlyViewedList;
    }

    @NonNull
    @Override
    public RecentlyViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recently_viewed_items, parent, false);

        return new RecentlyViewedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedViewHolder holder, final int position) {
        RecentlyViewed item = recentlyViewedList.get(position);

        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.price.setText(item.getPrice());
        holder.qty.setText(item.getQuantity());
        holder.unit.setText(item.getUnit());
        holder.bg.setBackgroundResource(item.getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use holder.getAdapterPosition() to get the current position
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    RecentlyViewed currentItem = recentlyViewedList.get(currentPosition);

                    // Correct Intent target class
                    Intent i = new Intent(context, ProductDetails.class);
                    i.putExtra("name", currentItem.getName());
                    i.putExtra("image", currentItem.getBigImageUrl());
                    i.putExtra("price", currentItem.getPrice());
                    i.putExtra("desc", currentItem.getDescription());
                    i.putExtra("qty", currentItem.getQuantity());
                    i.putExtra("unit", currentItem.getUnit());

                    context.startActivity(i);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return recentlyViewedList.size();
    }

    public static class RecentlyViewedViewHolder extends RecyclerView.ViewHolder {

        TextView name, description, price, qty, unit;
        ConstraintLayout bg;

        public RecentlyViewedViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.product_name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
            qty = itemView.findViewById(R.id.qty);
            unit = itemView.findViewById(R.id.unit);
            bg = itemView.findViewById(R.id.recently_layout);

        }
    }

}
