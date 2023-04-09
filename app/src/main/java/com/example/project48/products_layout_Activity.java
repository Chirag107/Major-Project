package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class products_layout_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_layout);


        ImageButton btn=findViewById(R.id.almondbtn);
        ImageButton btn1=findViewById(R.id.cocobtn);
        ImageButton btn2=findViewById(R.id.nigerseedbtn);




    }
    public void coconut(View view) {
        Intent intent2=new Intent(this, cocoslider.class);

        startActivity(intent2);
    }
    public void slider(View view) {
        Intent intent1=new Intent(this, almondslider.class);

        startActivity(intent1);
    }

    public void nigerr(View view) {
        Intent intent3=new Intent(this, nigerseedslider.class);
        startActivity(intent3);
    }

    public void seasmeslide(View view)
    {
        Intent intent4=new Intent(this, Seasmeslide.class);
        startActivity(intent4);
    }

    public void saffslide(View view)
    {
        Intent intent5=new Intent(this, saffslide.class);
        startActivity(intent5);
    }



}