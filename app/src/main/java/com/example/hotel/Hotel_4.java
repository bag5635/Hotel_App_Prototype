package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hotel_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel4);

    }
    public void Choice(View v) {
        startActivity(new Intent(Hotel_4.this, Hotel_5.class));
        HotelSet.setH4(1);
    }
    public void NO(View v) {
        startActivity(new Intent(Hotel_4.this, Hotel_5.class));
        HotelSet.setH4(0);
    }
    public void fav(View v){
        startActivity(new Intent(Hotel_4.this, Favorites.class));
    }
}