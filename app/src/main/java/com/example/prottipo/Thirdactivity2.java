package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class Thirdactivity2 extends AppCompatActivity {

    private Button nextActivity;
    private Button cadastrarnovo2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2b);

        nextActivity = findViewById(R.id.prosseguir1);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        cadastrarnovo2 = findViewById(R.id.cadastronovob);
        cadastrarnovo2.setOnClickListener(new View.OnClickListener() {
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
        Intent Intent = new Intent(this, Cadastro2.class);
        startActivity(Intent);
    }
}