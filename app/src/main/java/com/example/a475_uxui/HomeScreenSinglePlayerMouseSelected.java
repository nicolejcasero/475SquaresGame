package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenSinglePlayerMouseSelected extends AppCompatActivity {

    private ImageView start_button;
    private ImageView dog_avatar;
    private ImageView pig_avatar;
    private ImageView dragon_avatar;
    private ImageView snake_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_mouse_selected);

        snake_avatar = (ImageView) findViewById(R.id.snake_avatar);
        snake_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectSnake();
            }
        });

        dragon_avatar = (ImageView) findViewById(R.id.dragon_avatar);
        dragon_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDragon();
            }
        });

        dog_avatar = (ImageView) findViewById(R.id.dog_avatar);
        dog_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDog();
            }
        });

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

    public void selectDog() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerDogSelected.class);
        startActivity(intent);
    }

    public void selectPig() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerPigSelected.class);
        startActivity(intent);
    }

    public void selectDragon() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerDragonSelected.class);
        startActivity(intent);
    }

    public void selectSnake() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerSnakeSelected.class);
        startActivity(intent);
    }
}