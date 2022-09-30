package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

    }

    public void Choice(View v) {
        startActivity(new Intent(DisplayMessageActivity.this, Hotel_2.class));
        HotelSet.setH1(1);
    }
    public void NO(View v){
        startActivity(new Intent(DisplayMessageActivity.this,Hotel_2.class));
        HotelSet.setH1(0);
    }
    public void fav(View v){
        startActivity(new Intent(DisplayMessageActivity.this, Favorites.class));
    }
}