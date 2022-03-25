package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenSinglePlayerChooseCharacter extends AppCompatActivity {

    private ImageView dog_avatar;
    private ImageView pig_avatar;
    private ImageView mouse_avatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_choose_character);

        mouse_avatar = (ImageView) findViewById(R.id.mouse_avatar);
        mouse_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectMouse();
            }
        });

        pig_avatar = (ImageView) findViewById(R.id.pig_avatar);
        pig_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPig();
            }
        });

        dog_avatar = (ImageView) findViewById(R.id.dog_avatar);
        dog_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDog();
            }
        });
    }

    public void selectDog() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerDogSelected.class);
        startActivity(intent);
    }

    public void selectPig() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerPigSelected.class);
        startActivity(intent);
    }

    public void selectMouse() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerMouseSelected.class);
        startActivity(intent);
    }
}