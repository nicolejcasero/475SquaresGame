package com.example.a475_uxui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenChooseMode extends AppCompatActivity {

    //private ImageView imageView;
    private ImageView single_player_button_unselected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_choose_mode);

        single_player_button_unselected = (ImageView) findViewById(R.id.single_player_button_unselected);
        single_player_button_unselected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreenSinglePlayerChooseCharacter();
            }
        });
        }

        /*imageView = (ImageView) findViewById(R.id.imageView12);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGame();
            }
        }); */

    public void openHomeScreenSinglePlayerChooseCharacter() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerChooseCharacter.class);
        startActivity(intent);
    }

    /*public void openGame() {
        Intent intent = new Intent(this, GamePage.class);
        startActivity(intent);
    }*/
}