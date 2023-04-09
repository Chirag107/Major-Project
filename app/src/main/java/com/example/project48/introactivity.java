package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class introactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity);

        Button button=findViewById(R.id.signupbutton);
        Button button1=findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        openlogin();
    }
});

    }

    private void openlogin() {
        Intent inet1=new Intent(this, LoginActivity.class);
        startActivity(inet1);
    }


    private void opensignup() {

            Intent intent=new Intent(this, signupactivity.class);
            startActivity(intent);

    }

}