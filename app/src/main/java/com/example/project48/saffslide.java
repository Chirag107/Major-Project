package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class saffslide extends AppCompatActivity {

    private ImageSlider imageSlider5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saffslide);

        imageSlider5=findViewById(R.id.saffoil);

        ArrayList<SlideModel> slideModels4= new ArrayList<>();

        slideModels4.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2FFlaxseed%20Oil%2FGroundnut%20Oil%2FMustard%20Oil%2FNigerseed%20Oil%2FSafflower%20Oil%2Fsafflower.png?alt=media&token=3998d6b3-7839-4157-abaa-11b0c1841582", ScaleTypes.FIT));
        slideModels4.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2FFlaxseed%20Oil%2FGroundnut%20Oil%2FMustard%20Oil%2FNigerseed%20Oil%2FSafflower%20Oil%2Fbsafflower.png?alt=media&token=f5c24d15-81d8-4b7e-853d-bd722dc68d2f", ScaleTypes.FIT));
        slideModels4.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/diff.png?alt=media&token=260ab645-73e8-4c9c-b22c-97c436186b0c", ScaleTypes.FIT));

        imageSlider5.setImageList(slideModels4, ScaleTypes.FIT);


    }
}