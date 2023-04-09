package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class almondslider extends AppCompatActivity {

    private ImageSlider imageSlider;
    Button cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almondslider);

        cart=findViewById(R.id.buttoncart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirect();
            }
        });

        imageSlider=findViewById(R.id.almondslider);

        ArrayList<SlideModel> slideModels= new ArrayList<>();

        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Almond%20Oil%2Falmond.png?alt=media&token=8083ed81-cbf6-4930-b25f-50eea59e02c1", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Almond%20Oil%2Fbalmond.png?alt=media&token=f60e4ad8-9f1a-4fe7-8cb3-94497d41085c", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/diff.png?alt=media&token=260ab645-73e8-4c9c-b22c-97c436186b0c", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);






    }

    private void redirect() {
        Intent intent = new Intent(this, almondoil.class);
        startActivity(intent);

    }
}