package com.solal.instagram10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {


    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




  linearLayout = findViewById(R.id.linearboutons);

  LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100, 100);
  params.setMargins(25,15, 0,10);

        CircleImageView pp  = new CircleImageView(this);
        pp.setImageDrawable(getResources().getDrawable(R.drawable.e));
        linearLayout.addView(pp, params);







    }
}