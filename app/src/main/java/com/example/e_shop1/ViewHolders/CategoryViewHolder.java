package com.example.e_shop1.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_shop1.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    ImageView categoryIcon;
    public TextView categoryName;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        categoryIcon = itemView.findViewById(R.id.CategoryIcon);
        categoryName = itemView.findViewById(R.id.CategoryName);
    }
}