package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hotel_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);

    }
    public void Choice(View v) {
        startActivity(new Intent(Hotel_2.this, Hotel_3.class));
        HotelSet.setH2(1);
    }
    public void NO(View v) {
        startActivity(new Intent(Hotel_2.this, Hotel_3.class));
        HotelSet.setH2(0);
    }
    public void fav(View v){
        startActivity(new Intent(Hotel_2.this, Favorites.class));
    }
}