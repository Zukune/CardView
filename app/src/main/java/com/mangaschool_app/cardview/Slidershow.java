package com.mangaschool_app.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.mangaschool_app.cardview.model.Album;

import java.util.ArrayList;

public class Slidershow extends AppCompatActivity implements  ViewPagerEx.OnPageChangeListener {


    SliderLayout sliderLayout;
    ArrayList<String> urlList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slidershow);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int album = extras.getInt("album");


            switch (album) {

                case 0:
                    urlList.add("http://imageshack.com/a/img922/6719/xLjXwa.jpg");
                    urlList.add("http://imageshack.com/a/img922/6719/xLjXwa.jpg");
                    urlList.add("http://imageshack.com/a/img922/6719/xLjXwa.jpg");
                    urlList.add("http://imageshack.com/a/img922/6719/xLjXwa.jpg");
                    break;
                case 1:
                    urlList.add("http://imageshack.com/a/img923/6757/M70jrN.jpg");
                    urlList.add("http://imageshack.com/a/img923/6757/M70jrN.jpg");
                    urlList.add("http://imageshack.com/a/img923/6757/M70jrN.jpg");
                    urlList.add("http://imageshack.com/a/img923/6757/M70jrN.jpg");

                    break;

                case 2:
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpgg");

                    break;
                case 3:
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");
                    urlList.add("http://imageshack.com/a/img922/2751/85KVWm.jpg");

                    break;
                case 4:
                    urlList.add("http://imageshack.com/a/img922/5769/WtMb5K.jpg");
                    urlList.add("http://imageshack.com/a/img922/5769/WtMb5K.jpg");
                    urlList.add("http://imageshack.com/a/img922/5769/WtMb5K.jpg");
                    urlList.add("http://imageshack.com/a/img922/5769/WtMb5K.jpg");
                    urlList.add("http://imageshack.com/a/img922/5769/WtMb5K.jpg");

                    break;
                default:
                    break;
            }

            sliderLayout = (SliderLayout) findViewById(R.id.slider);


            for (String name : urlList) {

                DefaultSliderView imageSliderView = new DefaultSliderView(Slidershow.this);
                imageSliderView
                        .image(name)
                        .setScaleType(BaseSliderView.ScaleType.Fit);
                imageSliderView.bundle(new Bundle());
                imageSliderView.getBundle();
                sliderLayout.addSlider(imageSliderView);
                sliderLayout.setPresetTransformer(SliderLayout.Transformer.FlipHorizontal);
                sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
                sliderLayout.setCustomAnimation(new DescriptionAnimation());
                sliderLayout.stopAutoCycle();
                sliderLayout.addOnPageChangeListener(this);
            }


        }



    }

        @Override
        protected void onStop () {

            sliderLayout.stopAutoCycle();

            super.onStop();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);


    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}



