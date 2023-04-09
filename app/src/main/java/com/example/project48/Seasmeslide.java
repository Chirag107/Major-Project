package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Seasmeslide extends AppCompatActivity {

    private ImageSlider imageSlider3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasmeslide);

        imageSlider3=findViewById(R.id.seasmeoil);

        ArrayList<SlideModel> slideModels3= new ArrayList<>();

        slideModels3.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2FFlaxseed%20Oil%2FGroundnut%20Oil%2FMustard%20Oil%2FNigerseed%20Oil%2FSafflower%20Oil%2FSeasme%20Oil%2Fseasame.png?alt=media&token=f0eb1ff4-3354-451a-9e1f-191fa2eaa3d7", ScaleTypes.FIT));
        slideModels3.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2FFlaxseed%20Oil%2FGroundnut%20Oil%2FMustard%20Oil%2FNigerseed%20Oil%2FSafflower%20Oil%2FSeasme%20Oil%2Fbsesame.png?alt=media&token=a83d64fa-7fc4-48f1-9958-c6167107c005", ScaleTypes.FIT));
        slideModels3.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/diff.png?alt=media&token=260ab645-73e8-4c9c-b22c-97c436186b0c", ScaleTypes.FIT));

        imageSlider3.setImageList(slideModels3, ScaleTypes.FIT);

    }

    }
