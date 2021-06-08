package com.example.shoppingapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shoppingapp.R;
import com.example.shoppingapp.controller.RecyclerAdapter;
import com.example.shoppingapp.model.Product;
import com.example.shoppingapp.model.ProductCollection;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView  productRecyclerView;
    private ImageView basket;

    Product product;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productRecyclerView = findViewById(R.id.productRecyclerViewId);
        basket = findViewById(R.id.imageView2);



        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productRecyclerView.setLayoutManager(layoutManager);
        //adapter = new RecyclerAdapter(products, this);
        productRecyclerView.setAdapter(new RecyclerAdapter(ProductCollection.getSpaceships(),this));


        product = new Product();

        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this, BasketActivity.class);
                startActivity(i);
            }
        });


    }




}