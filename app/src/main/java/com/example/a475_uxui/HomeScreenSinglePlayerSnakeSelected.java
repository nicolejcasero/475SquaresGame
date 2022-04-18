package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a475_uxui.gameplay.GameActivity;

public class HomeScreenSinglePlayerSnakeSelected extends AppCompatActivity {

    private ImageView start_button;
    private ImageView dog_avatar;
    private ImageView pig_avatar;
    private ImageView mouse_avatar;
    private ImageView dragon_avatar;
    private ImageView tiger_avatar;
    private ImageView multi_player_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_snake_selected);

        multi_player_button = (ImageView) findViewById(R.id.multi_player_button_unselected);
        multi_player_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiPlayerChooseCharacterPlayerOne();
            }
        });

        tiger_avatar = (ImageView) findViewById(R.id.tiger_avatar);
        tiger_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectTiger();
            }
        });

        dragon_avatar = (ImageView) findViewById(R.id.dragon_avatar);
        dragon_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDragon();
            }
        });

        mouse_avatar = (ImageView) findViewById(R.id.mouse_avatar);
        mouse_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectMouse();
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
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("resId", R.drawable.snake_avatar);
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

    public void selectMouse() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerMouseSelected.class);
        startActivity(intent);
    }

    public void selectDragon() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerDragonSelected.class);
        startActivity(intent);
    }

    public void selectTiger() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerTigerSelected.class);
        startActivity(intent);
    }

    public void openMultiPlayerChooseCharacterPlayerOne() {
        Intent intent = new Intent(this, HomeScreenMultiPlayerChooseCharacterPlayerOne.class);
        startActivity(intent);
    }
}