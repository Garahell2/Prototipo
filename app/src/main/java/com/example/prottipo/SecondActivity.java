package com.example.prottipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity {

private Button button;
    private Button pressurepump1;
    private Button pressuregauge2;
    private Button handtoolwrench3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);

        button = findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        pressurepump1 = findViewById(R.id.pressurepump);
        pressurepump1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        pressuregauge2 = findViewById(R.id.pressuregauge);
        pressuregauge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });
        handtoolwrench3 = findViewById(R.id.handtoolwrench);
        handtoolwrench3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity3();
            }
        });
    } private void changeActivity(){
            Intent Intent = new Intent(this, ThirdActivity.class);
            startActivity(Intent);
    } private void changeActivity2(){
        Intent Intent = new Intent(this, Thirdactivity2.class);
        startActivity(Intent);
    } private void changeActivity3(){
        Intent Intent = new Intent(this, Thirdactivity3.class);
        startActivity(Intent);
    }
}