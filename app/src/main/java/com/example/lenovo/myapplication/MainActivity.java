package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MYLOG", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MYLOG", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MYLOG", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MYLOG", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MYLOG", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MYLOG", "onStop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation anim_clockwise = AnimationUtils.loadAnimation(this, R.anim.rotate);
        ImageView logo_launcher = findViewById(R.id.logo_launcher);

        anim_clockwise.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(getApplicationContext(), InputActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        logo_launcher.startAnimation(anim_clockwise);
    }
}
