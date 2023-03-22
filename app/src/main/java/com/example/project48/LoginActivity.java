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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    FirebaseAuth fauth= FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.llogin);
        EditText email = findViewById(R.id.lemail);

        EditText password = findViewById(R.id.lpass);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lemail=email.getText().toString();
                String lpass=password.getText().toString();
                fauth.signInWithEmailAndPassword(lemail,lpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();

                            openhomepage();
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Credentials wrong",Toast.LENGTH_SHORT).show();
                        }
            }
        });
            }
});}

    public void openhomepage(){
        Intent homepg= new Intent(this,Homepage_Activity.class);
        startActivity(homepg);
    }
}

