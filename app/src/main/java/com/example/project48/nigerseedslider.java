package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class nigerseedslider extends AppCompatActivity {

    private ImageSlider imageSlider2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nigerseedslider);

        imageSlider2=findViewById(R.id.nigeer2);

        ArrayList<SlideModel> slideModels2= new ArrayList<>();

        slideModels2.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2FFlaxseed%20Oil%2FGroundnut%20Oil%2FMustard%20Oil%2FNigerseed%20Oil%2Fnigerseed.png?alt=media&token=9e4d04e0-8dda-4fa7-9327-575fac866246", ScaleTypes.FIT));
        slideModels2.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2FFlaxseed%20Oil%2FGroundnut%20Oil%2FMustard%20Oil%2FNigerseed%20Oil%2Fbnigerseed.png?alt=media&token=ee2c570f-05c7-4661-aae1-a1f3dbd6b9de", ScaleTypes.FIT));
        slideModels2.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/diff.png?alt=media&token=260ab645-73e8-4c9c-b22c-97c436186b0c", ScaleTypes.FIT));

        imageSlider2.setImageList(slideModels2, ScaleTypes.FIT);

    }
}