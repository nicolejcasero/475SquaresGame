package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a475_uxui.gameplay.GameActivity;
import com.example.a475_uxui.gameplay.GameActivityMulti;

public class HomeScreenSinglePlayerDogSelected extends AppCompatActivity {

    private ImageView start_button;
    private ImageView pig_avatar;
    private ImageView mouse_avatar;
    private ImageView dragon_avatar;
    private ImageView snake_avatar;
    private ImageView tiger_avatar;
    private ImageView multi_player_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_dog_selected);

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

        pig_avatar = (ImageView) findViewById(R.id.pig_avatar);
        pig_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPig();
            }
        });

        mouse_avatar = (ImageView) findViewById(R.id.mouse_avatar);
        mouse_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectMouse();
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
        //TESTING MULTIPLAYER, BUT EVENTUALLY MOVE TO A DIFFERENT FILE
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("resId", R.drawable.dog_avatar);
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

    public void selectSnake() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerSnakeSelected.class);
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