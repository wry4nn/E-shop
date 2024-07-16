package com.example.e_shop1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.e_shop1.Adapters.ProductAdapter;
import org.litepal.LitePal;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView exploreButton;
    private ImageView cartButton;
    private ImageView profileButton;
//    private RecyclerView recyclerView;
//    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exploreButton = findViewById(R.id.ExploreButton);
        cartButton = findViewById(R.id.CartButton);
        profileButton = findViewById(R.id.ProfileButton);
        //HUH whyn cannot here
//        recyclerView = findViewById(R.id.recyclerViewlisting);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//        LitePal.initialize(this);
//        saveCategoriesAndProducts();

//
//        RecyclerView recyclerView = findViewById(R.id.CategoryRecyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        List<Product> productList = LitePal.findAll(Product.class);
//        productAdapter = new ProductAdapter(productList);
//        recyclerView.setAdapter(productAdapter);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(MainActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cartActivity = new Intent(MainActivity.this, CartActivity.class);
                startActivity(cartActivity);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Profile opened", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    private void saveCategoriesAndProducts() {
//        String[] categories = {"Electronics", "Fashion", "Home", "Health and Beauty", "Books and Music", "Sports"};
//
//        for (String categoryName : categories) {
//            Category category = new Category();
//            category.setName(categoryName);
//            category.save();
//
//            //products put here
//            Product product1 = new Product();
//            product1.setName("Smartphone");
//            product1.setPrice(699.99);
//            product1.setDescription("Latest model with 128GB storage");
//            product1.setCategory(LitePal.where("name = ?", "Electronics").findFirst(Category.class));
//            product1.save();
//
//            Product product2 = new Product();
//            product2.setName("Running Shoes");
//            product2.setPrice(59.99);
//            product2.setDescription("Comfortable running shoes for all terrains");
//            product2.setCategory(LitePal.where("name = ?", "Sports").findFirst(Category.class));
//            product2.save();
//
//            for (int i = 1; i <= 5; i++) {
//                Product product = new Product();
//                product.setName(categoryName + " Product " + i);
//                product.setPrice(10.0 * i);
//                product.setDescription("Description for " + categoryName + " Product " + i);
//                product.setCategory(category);
//                product.save();
//            }
//        }
//    }
}
