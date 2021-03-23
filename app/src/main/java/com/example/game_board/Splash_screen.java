package com.example.game_board;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {

    private static int SPALASH_SCREEN = 5000;
    //variable
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen );
        //animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //hooks
        image = findViewById(R.id.imageView);
        welcome = findViewById(R.id.textView);
        image.setAnimation(topAnim);

        image.setAnimation(bottomAnim);
        welcome.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_screen.this, Play_screen.class);
                startActivity(intent);
                finish();
            }
        }, SPALASH_SCREEN);


//        Intent intent = new Intent(Splash_screen.this, Play_screen.class);
//        startActivity(intent);

    }
}



