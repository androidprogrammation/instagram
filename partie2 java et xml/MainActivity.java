package com.solal.instagram10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {


    LinearLayout linearLayout, linearLayout2;

    public void storie(Drawable drawable){

        CircleImageView img = new CircleImageView(this);
        img.setImageDrawable(drawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(200, 200);
        layoutParams.setMargins(35,10,35,10);
        linearLayout2.addView(img, layoutParams);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




  linearLayout = findViewById(R.id.linearboutons);
  linearLayout2 = findViewById(R.id.linear);

  LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100, 100);
  params.setMargins(25,23, 0,10);

        CircleImageView pp  = new CircleImageView(this);
        pp.setImageDrawable(getResources().getDrawable(R.drawable.e));
        linearLayout.addView(pp, params);


        storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));
        storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));



    }




}