package com.example.prottipo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Sequence extends AppCompatActivity {

private Button button;
    private Button pressurepump1;
    private Button pressuregauge2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3);

        button = findViewById(R.id.backButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        pressurepump1 = findViewById(R.id.automatico);
        pressurepump1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        pressuregauge2 = findViewById(R.id.manual);
        pressuregauge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });

    } private void changeActivity(){
            Intent Intent = new Intent(this, SeventhActivity.class);
            startActivity(Intent);
    } private void changeActivity2(){
        Intent Intent = new Intent(this, SeventhActivity2.class);
        startActivity(Intent);
    }
}