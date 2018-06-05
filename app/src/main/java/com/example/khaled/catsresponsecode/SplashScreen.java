package com.example.khaled.catsresponsecode;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundResource(R.drawable.catsplash)
                .withAfterLogoText(getString(R.string.splash_text));

        //Change text Font, size and color
        Typeface canterBurry=Typeface.createFromAsset(getApplicationContext()
                .getAssets(),"fonts/Canterbury.ttf");
        config.getAfterLogoTextView().setTypeface(canterBurry);
        config.getAfterLogoTextView().setTextSize(30);
        config.getAfterLogoTextView().setTextColor(Color.CYAN);


        View easySplashScreenView=config.create();
        setContentView(easySplashScreenView);
    }

}
