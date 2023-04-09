package com.example.project48;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class coconutoil extends AppCompatActivity {

    Button b1;
    TextView tv;
    EditText et;


    FirebaseAuth fauth;
    FirebaseDatabase fstore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coconutoil);

        b1=findViewById(R.id.cococartbutton);
        tv=findViewById(R.id.cococart);
        et=findViewById(R.id.cocotext1);
        fauth=FirebaseAuth.getInstance();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().isEmpty())
                {
                    Toast.makeText(coconutoil.this, "Enter Quantity", Toast.LENGTH_SHORT).show();
                }
                else {
                    update();
                }
            }
        });


    }

    private void update() {
        String quantity = et.getText().toString();
         String product=tv.getText().toString();


        Cart dataclass=new Cart(quantity,product);


        FirebaseDatabase.getInstance().getReference("User Cart").child(quantity).setValue(dataclass).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(coconutoil.this, "Details Updated",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(coconutoil.this, "Failed",Toast.LENGTH_SHORT).show();
            }
        });


    }
}

