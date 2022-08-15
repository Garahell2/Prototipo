package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class FourthActivity extends AppCompatActivity {

    private Button nextActivity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrocliente);

        nextActivity = findViewById(R.id.prosseguir2);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });



    }private void changeActivity(){
        Intent Intent = new Intent(this, FifthActivity.class);
        startActivity(Intent);
    }
}