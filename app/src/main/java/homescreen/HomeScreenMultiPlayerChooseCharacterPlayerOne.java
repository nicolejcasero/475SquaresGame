package homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a475_uxui.R;

public class HomeScreenMultiPlayerChooseCharacterPlayerOne extends AppCompatActivity {

    private ImageView single_player_button;
    private ImageView dog_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_multi_player_choose_character_player_one);

        dog_avatar = (ImageView) findViewById(R.id.dog_avatar);
        dog_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiPlayerDogSelected();
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

    public void openMultiPlayerDogSelected() {
        Intent intent = new Intent(this, HomeScreenMultiPlayerDogSelectedPlayerOne.class);
        startActivity(intent);
    }
}