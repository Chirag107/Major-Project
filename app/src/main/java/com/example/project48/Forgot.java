package com.example.project48;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forgot extends AppCompatActivity {
    private Button forgotbtn;
    private EditText txtemail;
    private String email;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        getSupportActionBar().hide();

        auth = FirebaseAuth.getInstance();

        txtemail = findViewById(R.id.email2);
        forgotbtn = findViewById(R.id.forgotntn);
        forgotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateData();
            }
        });
    }

    private void validateData() {
        email = txtemail.getText().toString();
        if (email.isEmpty()) {
            txtemail.setError("Email Required");
        } else {
            forgetpass();
        }
    }

    private void forgetpass() {
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Forgot.this,"Password Reset Link sent to your Email", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Forgot.this, LoginActivity.class));
                    finish();
                }
                else {
                    Toast.makeText(Forgot.this,"Enter Valid Email", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}