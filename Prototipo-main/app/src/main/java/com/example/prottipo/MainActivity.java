package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button nextActivity;
    private Button cadastrar;
    private Button retrieve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextActivity = findViewById(R.id.nextButton);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
changeActivity();
            }
        });
        cadastrar = findViewById(R.id.registrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });
        retrieve = findViewById(R.id.recuperar);
        retrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity3();
            }
        });


    }private void changeActivity(){
        Intent Intent = new Intent(this, SecondActivity.class);
        startActivity(Intent);
    }private void changeActivity2(){
        Intent Intent = new Intent(this, registrar.class);
        startActivity(Intent);
    }private void changeActivity3(){
        Intent Intent = new Intent(this, retrieve.class);
        startActivity(Intent);
    }
}