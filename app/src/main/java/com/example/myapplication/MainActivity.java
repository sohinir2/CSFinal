package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button camButton;
    private Button photoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camButton = (Button) findViewById(R.id.camera);
        camButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });
        photoButton = (Button) findViewById(R.id.photogallery);
        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhotoGallery();
            }
        });
    }

    public void openCamera() {
        Intent intent = new Intent(this, Camera.class);
        startActivity(intent);
    }

    public void openPhotoGallery() {
        Intent intent = new Intent(this, PhotoGallery.class);
        startActivity(intent);
    }
}