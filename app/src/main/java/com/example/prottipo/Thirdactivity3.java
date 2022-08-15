package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class Thirdactivity3 extends AppCompatActivity {

    private Button nextActivity;
    private Button cadastro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2c);

        nextActivity = findViewById(R.id.prosseguir1);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        cadastro = findViewById(R.id.cadastronovoc);
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });


    }private void changeActivity(){
        Intent Intent = new Intent(this, FourthActivity.class);
        startActivity(Intent);
    }
    private void changeActivity2(){
        Intent Intent = new Intent(this, Cadastro3.class);
        startActivity(Intent);
    }
}