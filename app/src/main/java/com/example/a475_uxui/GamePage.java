package com.example.a475_uxui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Objects;

public class GamePage extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);

        button = (ImageButton) findViewById(R.id.homeButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    openHome();
                }
            });
    }

    public void openHome() {
        Intent intent = new Intent(this, HomeScreenChooseMode.class);
        startActivity(intent);
    }
}