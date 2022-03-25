package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenSinglePlayerChooseCharacter extends AppCompatActivity {

    private ImageView dog_avatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_choose_character);

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
}