package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenSinglePlayerDogSelected extends AppCompatActivity {

    private ImageView start_button;
    private ImageView pig_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_dog_selected);

        pig_avatar = (ImageView) findViewById(R.id.pig_avatar);
        pig_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPig();
            }
        });

        start_button = (ImageView) findViewById(R.id.start_button);
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGame();
            }
        });
    }

    public void openGame() {
        Intent intent = new Intent(this, GamePage.class);
        startActivity(intent);
    }

    public void selectPig() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerPigSelected.class);
        startActivity(intent);
    }
}