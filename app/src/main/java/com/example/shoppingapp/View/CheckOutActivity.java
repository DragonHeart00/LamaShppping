package com.example.shoppingapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shoppingapp.R;

public class CheckOutActivity extends AppCompatActivity {

    Button payid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);


        payid = findViewById(R.id.payid);


        payid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckOutActivity.this, LastActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}