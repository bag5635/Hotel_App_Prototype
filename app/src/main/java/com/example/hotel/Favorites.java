package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
//Getting all of the numbers for the hotels, either 1 or 0.
        LinearLayout linearLayout = findViewById(R.id.rootLayout);
        //HotelSet hotels = new HotelSet(0,0,0,0,0);
        int h1,h2,h3,h4,h5;
        h1 = HotelSet.getH1();
        h2 = HotelSet.getH2();
        h3 = HotelSet.getH3();
        h4 = HotelSet.getH4();
        h5 = HotelSet.getH5();



        TextView textView = new TextView(this);
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setGravity(Gravity.CENTER);
        textView.setText(R.string.CLICK);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
        textView.setTextColor(Color.parseColor("#FFFFFFFF"));
        if (linearLayout != null) {
            linearLayout.addView(textView);
        }

//If statement to check if 1 as been set for any hotel. If 1 has been set it will display that info.
        if (h5 == 1)
        {
            Button buttonView = new Button(this);
            //TextView textView = new TextView(this);
            buttonView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            buttonView.setGravity(Gravity.CENTER);
            buttonView.setText(R.string.Hotel_5);
            buttonView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            buttonView.setTextColor(Color.parseColor("#FFFFFFFF"));
            buttonView.setBackgroundColor(Color.parseColor("#e41b56"));
            buttonView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Favorites.this, FavInfo.class));
                    HotelFavSet.setH_1(0);
                    HotelFavSet.setH_2(0);
                    HotelFavSet.setH_3(0);
                    HotelFavSet.setH_4(0);
                    HotelFavSet.setH_5(1);
                    // Do something in response to button click
                }
            });

            if (linearLayout != null) {
                linearLayout.addView(buttonView);
            }
        }
        if (h4 == 1)
        {
            Button buttonView = new Button(this);
            //TextView textView = new TextView(this);
            buttonView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            buttonView.setGravity(Gravity.CENTER);
            buttonView.setText(R.string.Hotel_4);
            buttonView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            buttonView.setTextColor(Color.parseColor("#FFFFFFFF"));
            buttonView.setBackgroundColor(Color.parseColor("#e41b56"));
            buttonView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Favorites.this, FavInfo.class));
                    HotelFavSet.setH_1(0);
                    HotelFavSet.setH_2(0);
                    HotelFavSet.setH_3(0);
                    HotelFavSet.setH_4(1);
                    HotelFavSet.setH_5(0);
                    // Do something in response to button click
                }
            });


            if (linearLayout != null) {
                linearLayout.addView(buttonView);

            }
        }
        if (h3 == 1)
        {
            Button buttonView = new Button(this);
            //TextView textView = new TextView(this);
            buttonView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            buttonView.setGravity(Gravity.CENTER);
            buttonView.setText(R.string.Hotel_3);
            buttonView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            buttonView.setTextColor(Color.parseColor("#FFFFFFFF"));
            buttonView.setBackgroundColor(Color.parseColor("#e41b56"));
            buttonView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Favorites.this, FavInfo.class));
                    HotelFavSet.setH_1(0);
                    HotelFavSet.setH_2(0);
                    HotelFavSet.setH_3(1);
                    HotelFavSet.setH_4(0);
                    HotelFavSet.setH_5(0);
                    // Do something in response to button click
                }
            });

            if (linearLayout != null) {
                linearLayout.addView(buttonView);
            }
        }
        if (h2 == 1) {
            Button buttonView = new Button(this);
            //TextView textView = new TextView(this);
            buttonView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            buttonView.setGravity(Gravity.CENTER);
            buttonView.setText(R.string.Hotel_2);
            buttonView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            buttonView.setTextColor(Color.parseColor("#FFFFFFFF"));
            buttonView.setBackgroundColor(Color.parseColor("#e41b56"));
            buttonView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Favorites.this, FavInfo.class));
                    HotelFavSet.setH_1(0);
                    HotelFavSet.setH_2(1);
                    HotelFavSet.setH_3(0);
                    HotelFavSet.setH_4(0);
                    HotelFavSet.setH_5(0);
                    // Do something in response to button click
                }
            });

            if (linearLayout != null) {
                linearLayout.addView(buttonView);
            }
        }
        if (h1 == 1) {
            Button buttonView = new Button(this);
            //TextView textView = new TextView(this);
            buttonView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            buttonView.setGravity(Gravity.CENTER);
            buttonView.setText(R.string.Hotel_1);
            buttonView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            buttonView.setTextColor(Color.parseColor("#FFFFFFFF"));
            buttonView.setBackgroundColor(Color.parseColor("#e41b56"));

            buttonView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Favorites.this, FavInfo.class));
                    HotelFavSet.setH_1(1);
                    HotelFavSet.setH_2(0);
                    HotelFavSet.setH_3(0);
                    HotelFavSet.setH_4(0);
                    HotelFavSet.setH_5(0);
                    // Do something in response to button click
                }
            });
            //ImageView imageView = new ImageView(this);
            //imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            //imageView.setImageResource(R.drawable.bigtest);

            if (linearLayout != null) {
                linearLayout.addView(buttonView);
                //linearLayout.addView(imageView);
            }
        }

    }
}