package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class Cadastro extends AppCompatActivity {

    private Button nextActivity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        nextActivity = findViewById(R.id.button8);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });



    }private void changeActivity(){
        Intent Intent = new Intent(this, ThirdActivity.class);
        startActivity(Intent);
    }
}