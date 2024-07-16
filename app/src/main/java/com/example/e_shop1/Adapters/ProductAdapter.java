package com.example.e_shop1.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.e_shop1.Product;
import com.example.e_shop1.R;
import java.util.List;
import com.squareup.picasso.Picasso;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.titleTxt.setText(product.getName());
        holder.descriptionTxt.setText(product.getDescription());
        holder.priceTxt.setText(String.format("$%.2f", product.getPrice()));
//        Picasso.get().load(product.getImageUrl()).into(holder.productView);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productView;
        TextView titleTxt;
        TextView descriptionTxt;
        TextView priceTxt;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productView = itemView.findViewById(R.id.productView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            descriptionTxt = itemView.findViewById(R.id.descriptionTxt);
            priceTxt = itemView.findViewById(R.id.priceTxt);
        }
    }
}
