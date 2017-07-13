package com.mangaschool_app.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mangaschool_app.cardview.R;

/**
 * Created by shins on 7/10/2017.
 */

public class DetailActivity extends AppCompatActivity {


    ImageView imageView;



    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        imageView = (ImageView) findViewById(R.id.thumbnail_image_header);


        String thumbnail = getIntent().getExtras().getString("thumbnail");




        Glide.with(this)

                .load(thumbnail)

                .placeholder(R.drawable.loading)

                .into(imageView);



        getSupportActionBar().setTitle("Details Activity");



    }



}