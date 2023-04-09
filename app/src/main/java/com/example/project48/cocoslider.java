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
import java.util.List;

public class cocoslider extends AppCompatActivity {

      private ImageSlider imageSlider1;
      Button cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocoslider);

        imageSlider1=findViewById(R.id.cocoslider);
        cart=findViewById(R.id.cococartbtn);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirect();
            }
        });

        ArrayList<SlideModel> slideModels1= new ArrayList<>();

        slideModels1.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2Fcoconut.png?alt=media&token=51d639c2-0b1f-4e77-9f40-6499002bd869", ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/Coconut%20Oil%2Fbcoconut.png?alt=media&token=59a30d7c-d430-4771-a4ce-b731e3001390", ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/gotya-cha-project.appspot.com/o/diff.png?alt=media&token=260ab645-73e8-4c9c-b22c-97c436186b0c", ScaleTypes.FIT));

        imageSlider1.setImageList(slideModels1, ScaleTypes.FIT);








    }

    private void redirect() {
        Intent intent=new Intent(this, coconutoil.class);
        startActivity(intent);
    }
}