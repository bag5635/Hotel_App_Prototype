package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FavInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_info);

        RelativeLayout relativeLayout = findViewById(R.id.rootLayout2);



        int h_1,h_2,h_3,h_4,h_5;
        h_1 = HotelFavSet.getH_1();
        h_2 = HotelFavSet.getH_2();
        h_3 = HotelFavSet.getH_3();
        h_4 = HotelFavSet.getH_4();
        h_5 = HotelFavSet.getH_5();

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        if (h_1 == 1) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setText(R.string.Hotel_1);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            textView.setPaddingRelative(0,0,0,20);
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setImageResource(R.drawable.bigtest);


            Button link = new Button(this);
            link.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            String text = "Comfort Inn Link";
            link.setText(text);
            link.setPaddingRelative(0,0,0,0);
            link.setGravity(Gravity.CENTER);
            link.setBackgroundColor(Color.parseColor("#e41b56"));
            link.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            link.setTextColor(Color.parseColor("#FFFFFFFF"));
            link.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String url = "https://www.choicehotels.com/pennsylvania/middletown/comfort-inn-hotels/pa786";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            });


            if (relativeLayout != null) {
                relativeLayout.addView(link);
                relativeLayout.addView(textView);
                relativeLayout.addView(imageView);
            }
        }
        if (h_2 == 1){
            TextView textView = new TextView(this);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setText(R.string.Hotel_2);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setImageResource(R.drawable.finalimageh2);


            Button link = new Button(this);
            link.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            String text = "Fairfield Inn Link";
            link.setText(text);
            link.setPaddingRelative(0,0,0,0);
            link.setGravity(Gravity.CENTER);
            link.setBackgroundColor(Color.parseColor("#e41b56"));
            link.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            link.setTextColor(Color.parseColor("#FFFFFFFF"));
            link.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String url = "https://www.marriott.com/hotels/travel/harfm-fairfield-inn-and-suites-harrisburg-international-airport/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_OTM1NDcyOC03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU%3D";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            });


            if (relativeLayout != null) {
                relativeLayout.addView(link);
                relativeLayout.addView(textView);
                relativeLayout.addView(imageView);
            }
        }
        if (h_3 == 1) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setText(R.string.Hotel_3);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setImageResource(R.drawable.finalhotel3);
            // image needs to change once we get the image


            Button link = new Button(this);
            link.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            String text = "Holiday Inn Link";
            link.setText(text);
            link.setPaddingRelative(0,0,0,0);
            link.setGravity(Gravity.CENTER);
            link.setBackgroundColor(Color.parseColor("#e41b56"));
            link.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            link.setTextColor(Color.parseColor("#FFFFFFFF"));
            link.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String url = "https://www.ihg.com/holidayinn/hotels/us/en/middletown/mdtmt/hoteldetail?cm_mmc=GoogleMaps-_-HI-_-US-_-MDTMT";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            });


            if (relativeLayout != null) {
                relativeLayout.addView(link);
                relativeLayout.addView(textView);
                relativeLayout.addView(imageView);
            }
        }
        if (h_4 == 1) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setText(R.string.Hotel_4);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setImageResource(R.drawable.finalhotel4);
            // image needs to change once we get the image


            Button link = new Button(this);
            link.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            String text = "Best Western Inn Link";
            link.setText(text);
            link.setPaddingRelative(20,0,0,0);
            link.setGravity(Gravity.CENTER);
            link.setBackgroundColor(Color.parseColor("#e41b56"));
            link.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            link.setTextColor(Color.parseColor("#FFFFFFFF"));
            link.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String url = "https://www.bestwestern.com/en_US/book/hotel-rooms.39134.html?iata=00171880&ssob=BLBWI0004G&cid=BLBWI0004G:google:gmb:39134";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            });
//https://www.bestwestern.com/en_US/book/hotel-rooms.39134.html?iata=00171880&ssob=BLBWI0004G&cid=BLBWI0004G:google:gmb:39134

            if (relativeLayout != null) {
                relativeLayout.addView(link);
                relativeLayout.addView(textView);
                relativeLayout.addView(imageView);

            }
        }
        if (h_5 == 1) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setText(R.string.Hotel_5);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setImageResource(R.drawable.hotelfinal5);
            // image needs to change once we get the image


            Button link = new Button(this);
            link.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            String text = "Holiday Lettings Link";
            link.setText(text);
            link.setPaddingRelative(0,0,0,0);
            link.setGravity(Gravity.CENTER);
            link.setBackgroundColor(Color.parseColor("#e41b56"));
            link.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
            link.setTextColor(Color.parseColor("#FFFFFFFF"));
            link.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String url = "https://www.holidaylettings.co.uk/rentals/highspire/8863182";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            });


            if (relativeLayout != null) {
                relativeLayout.addView(link);
                relativeLayout.addView(textView);
                relativeLayout.addView(imageView);
            }
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}