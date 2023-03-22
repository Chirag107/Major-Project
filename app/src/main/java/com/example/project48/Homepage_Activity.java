package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ImageButton cartbutton=findViewById(R.id.imageView2);
        ImageButton aboutusbutton=findViewById(R.id.imageView8);
        cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencart();
            }
        });
        aboutusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaboutus();
            }
        });
    }
    private void opencart() {
        Intent inet1=new Intent(this, CartActivity.class);
        startActivity(inet1);
    }
    private void openaboutus() {

        Intent intent=new Intent(this, about_us.class);
        startActivity(intent);

    }
}
