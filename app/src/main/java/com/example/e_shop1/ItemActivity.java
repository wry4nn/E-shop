package com.example.e_shop1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.e_shop1.Adapters.ProductAdapter;
import org.litepal.LitePal;
import java.util.List;

public class ItemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        recyclerView = findViewById(R.id.recyclerViewProduct);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Product> productList = LitePal.findAll(Product.class);
        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
    }
}
