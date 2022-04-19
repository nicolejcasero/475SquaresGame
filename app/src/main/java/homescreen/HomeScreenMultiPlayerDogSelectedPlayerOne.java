package homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a475_uxui.R;

public class HomeScreenMultiPlayerDogSelectedPlayerOne extends AppCompatActivity {

    private ImageView single_player_button;
    private ImageView dog_avatar_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_multi_player_dog_selected_player_one);

        dog_avatar_selected = (ImageView) findViewById(R.id.dog_avatar_selected_multi_player);
        dog_avatar_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlayerTwoSelectCharacter();
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

    public void openPlayerTwoSelectCharacter() {
        Intent intent = new Intent(this, HomeScreenMultiPlayerChooseCharacterPlayerTwo.class);
        startActivity(intent);
    }
}