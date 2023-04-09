package com.example.project48;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class almondoil extends AppCompatActivity {

    Button b1;
    EditText et1;
    TextView tv;

    FirebaseAuth fauth;
    FirebaseDatabase fstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almondoil);
        b1=findViewById(R.id.almdcartbutton);
        et1=findViewById(R.id.edittextcartalmd);
        tv=findViewById(R.id.almondcart);
        fauth=FirebaseAuth.getInstance();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().isEmpty())
                {
                    Toast.makeText(almondoil.this, "Enter Quantity", Toast.LENGTH_SHORT).show();
                }
                else {
                    update();
                }
            }
        });

    }

    private void update() {
        String quantity = et1.getText().toString();
        String prdalmnd =tv.getText().toString();

        Cart dataclass=new Cart(quantity,prdalmnd);

        FirebaseDatabase.getInstance().getReference("User Cart").child(quantity).setValue(dataclass).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(almondoil.this, "Details Updated",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(almondoil.this, "Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}