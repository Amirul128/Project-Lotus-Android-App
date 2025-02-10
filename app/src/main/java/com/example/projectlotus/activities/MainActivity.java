package com.example.projectlotus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.projectlotus.HomeActivity;
import com.example.projectlotus.R;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {


    FirebaseAuth auth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        auth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressbar);


        if (auth.getCurrentUser()!=null){
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
            Toast.makeText(this, "Loading......", Toast.LENGTH_SHORT).show();
            finish();
        }


    }

    public void login(View view) {

        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void register(View view) {
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }
}