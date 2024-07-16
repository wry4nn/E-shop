package com.example.e_shop1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    private ImageView exploreButton;
    private ImageView cartButton;
    private ImageView profileButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);

        exploreButton = findViewById(R.id.ExploreButton);
        cartButton = findViewById(R.id.CartButton);
        profileButton = findViewById(R.id.ProfileButton);


        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(GameActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cartActivity = new Intent(GameActivity.this, CartActivity.class);
                startActivity(cartActivity);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GameActivity.this, "Profile opened", Toast.LENGTH_SHORT).show();
            }
        });

    }
}