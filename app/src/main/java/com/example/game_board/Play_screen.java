package com.example.game_board;

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

    public void PlayBtn(View view) {
        Intent intent=new Intent(Play_screen.this,Name_add.class);
        startActivity(intent);
    }
}
