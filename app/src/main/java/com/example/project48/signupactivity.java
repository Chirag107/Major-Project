package com.example.project48;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class signupactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        FirebaseAuth fauth= FirebaseAuth.getInstance();
        EditText email = findViewById(R.id.email);
        EditText cemail = findViewById(R.id.conformemail);
        EditText pass = findViewById(R.id.password);
        EditText cpass = findViewById(R.id.llogin);
        Button signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                String semail = email.getText().toString();
                String scemail = cemail.getText().toString();
                String spass = pass.getText().toString();
                String scpass = cpass.getText().toString();
                if (scemail.equals(semail)) {
                    fauth.createUserWithEmailAndPassword(semail, spass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                {
                                    Toast.makeText(getApplicationContext(), "Registration successful", Toast.LENGTH_SHORT).show();
                                }

                            } else {
                                Toast.makeText(getApplicationContext(), "Registration fail", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


                } else if (scpass.equals(spass)) {
                    fauth.createUserWithEmailAndPassword(semail, spass).addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                {
                                    Toast.makeText(getApplicationContext(), "Registration successful", Toast.LENGTH_SHORT).show();
                                }

                            } else {
                                Toast.makeText(getApplicationContext(), "Registration fail", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


                }
            }

    });
}}