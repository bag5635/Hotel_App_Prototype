package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hotel_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel3);

    }
    public void Choice(View v) {
        startActivity(new Intent(Hotel_3.this, Hotel_4.class));
        HotelSet.setH3(1);
    }
    public void NO(View v){
        startActivity(new Intent(Hotel_3.this, Hotel_4.class));
        HotelSet.setH3(0);
    }
    public void fav(View v){
        startActivity(new Intent(Hotel_3.this, Favorites.class));
    }
}