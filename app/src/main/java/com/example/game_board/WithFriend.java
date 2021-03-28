package com.example.game_board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WithFriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_with_friend );
    }
    public void btn(View view) {
        Intent intent = new Intent( WithFriend.this, Play_screen.class );
        startActivity( intent );}



   }



