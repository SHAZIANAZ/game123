package com.shazia.game_board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Play_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_play_screen );
    }

    public void play(View view) {
        Intent intent = new Intent( Play_screen.this, ComputerGame.class );
        startActivity( intent );


    }

    public void play1(View view) {
        Intent intent = new Intent( Play_screen.this, MainActivity.class );
        startActivity( intent );


    }

}