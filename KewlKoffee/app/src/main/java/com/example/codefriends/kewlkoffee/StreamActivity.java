package com.example.codefriends.kewlkoffee;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


import com.squareup.picasso.Picasso;

public class StreamActivity extends AppCompatActivity {

    ProgressDialog dialog;
    ImageView imageView;
    ImageButton btnPlayPause;

    String imageUrl = "https://pics.me.me/cp-399-cp-920-pupper-doggo-26715445.png";



    public static Intent newIntent (Context packageContext) {
        Intent intent = new Intent(packageContext, StreamActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        btnPlayPause = findViewById(R.id.btn_play_pause);
        btnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(getApplicationContext()).load(imageUrl).into(imageView);
            }
        });

    }

}
