package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class Cadastro2 extends AppCompatActivity {

    private Button nextActivity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro2);

        nextActivity = findViewById(R.id.button9);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });



    }private void changeActivity(){
        Intent Intent = new Intent(this, Thirdactivity2.class);
        startActivity(Intent);
    }
}