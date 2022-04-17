package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenMultiPlayerChooseCharacterPlayerTwo extends AppCompatActivity {

    private ImageView single_player_button;
    private ImageView dog_avatar_taken_multi_player;
    private ImageView dragon_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_multi_player_choose_character_player_two);

        dragon_avatar = (ImageView) findViewById(R.id.dragon_avatar);
        dragon_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiPlayerDragonSelectedPlayerTwo();
            }
        });

        dog_avatar_taken_multi_player = (ImageView) findViewById(R.id.dog_avatar_taken_multi_player);
        dog_avatar_taken_multi_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiPlayerChooseCharacterPlayerOne();
            }
        });

        single_player_button = (ImageView) findViewById(R.id.single_player_button_unselected);
        single_player_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSinglePlayerChooseCharacter();
            }
        });
    }

    public void openSinglePlayerChooseCharacter() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerChooseCharacter.class);
        startActivity(intent);
    }

    public void openMultiPlayerChooseCharacterPlayerOne() {
        Intent intent = new Intent(this, HomeScreenMultiPlayerChooseCharacterPlayerOne.class);
        startActivity(intent);
    }

    public void openMultiPlayerDragonSelectedPlayerTwo() {
        Intent intent = new Intent(this, HomeScreenMultiPlayerDragonSelectedPlayerTwo.class);
        startActivity(intent);
    }
}