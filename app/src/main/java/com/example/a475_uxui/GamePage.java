package com.example.a475_uxui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

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
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    public void onButtonShowPauseWindowClick(View view) {
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View pauseView = inflater.inflate(R.layout.pause_popup, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true;
        final PopupWindow pauseWindow = new PopupWindow(pauseView, width, height, focusable);

        pauseWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
        pauseView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                pauseWindow.dismiss();
                return true;
            }
        });
    }
}