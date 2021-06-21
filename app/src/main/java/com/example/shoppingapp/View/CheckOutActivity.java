package com.example.shoppingapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shoppingapp.R;

public class CheckOutActivity extends AppCompatActivity {

    Button payId;
    TextView cardNumber, nameOnCard, expiryMonth, expiryYear, cvv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        cardNumber = findViewById(R.id.cardnumberId);
        nameOnCard = findViewById(R.id.nameOnCardId);
        expiryMonth = findViewById(R.id.expiryMonthId);
        expiryYear = findViewById(R.id.expiryYearId);
        cvv = findViewById(R.id.cvvId);
        payId = findViewById(R.id.payid);







        payId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(cardNumber.getText().toString())){
                    cardNumber.setError("not valid number");
                }else if(TextUtils.isEmpty(nameOnCard.getText().toString())){
                    nameOnCard.setError("not valid name");
                }else if(TextUtils.isEmpty(expiryMonth.getText().toString())){
                    expiryMonth.setError("not valid month");
                }else if(TextUtils.isEmpty(expiryYear.getText().toString())){
                    expiryYear.setError("not valid year");
                }else if(TextUtils.isEmpty(cvv.getText().toString())){
                    cvv.setError("not valid year");
                }else{
                    Intent intent = new Intent(CheckOutActivity.this, LastActivity.class);
                    startActivity(intent);
                    finish();
                }





            }
        });
    }
}