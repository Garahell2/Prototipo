package com.example.prottipo;



import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


import android.Manifest;
import android.content.Intent;

import android.content.pm.PackageManager;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class Photo extends AppCompatActivity {

    private Button nextActivity;
    ImageView imageView;
    Button foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);

        nextActivity = findViewById(R.id.prosseguir6);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        imageView = findViewById(R.id.imageView);
        foto = findViewById(R.id.Foto);


    }

    private void changeActivity(){
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }
}
