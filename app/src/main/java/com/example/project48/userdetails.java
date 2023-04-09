package com.example.project48;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;


public class userdetails extends AppCompatActivity {

    FirebaseAuth fauth;
    FirebaseDatabase fstore;
    String UserID;
    EditText first,last,dataema;
    Button datau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);


        first=findViewById(R.id.userfirst);
        last=findViewById(R.id.usersur);
        dataema=findViewById(R.id.uemail);
        datau=findViewById(R.id.save);
        fauth = FirebaseAuth.getInstance();


        datau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first.getText().toString().isEmpty() || last.getText().toString().isEmpty() || dataema.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter Details to Continue",Toast.LENGTH_SHORT).show();
                }
                else {

                    uploaddata();



                }
            }
        });


    }

    private void uploaddata() {


        String fname = first.getText().toString();
        String flast = last.getText().toString();
        String femail = dataema.getText().toString();

        data dataClass = new data(fname,flast, femail);

        FirebaseDatabase.getInstance().getReference("User Data").child(fname).setValue(dataClass).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){

                    Toast.makeText(userdetails.this, "Details Updated",Toast.LENGTH_SHORT).show();
                    redirect();
                    finish();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(userdetails.this, "Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void redirect() {
        Intent redirect = new Intent(this, LoginActivity.class);
        startActivity(redirect);
    }
}



