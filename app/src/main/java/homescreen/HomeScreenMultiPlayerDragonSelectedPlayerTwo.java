package homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a475_uxui.R;
import com.example.a475_uxui.gameplay.GameActivityMulti;

public class HomeScreenMultiPlayerDragonSelectedPlayerTwo extends AppCompatActivity {

    private ImageView start_button;
    private ImageView dog_avatar_taken_multi_player;
    private ImageView single_player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_multi_player_dragon_selected_player_two);

        dog_avatar_taken_multi_player = (ImageView) findViewById(R.id.dog_avatar_taken_multi_player);
        dog_avatar_taken_multi_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiPlayerChooseCharacterPlayerOne();
            }
        });

        single_player = (ImageView) findViewById(R.id.single_player_button_unselected);
        single_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSinglePlayerMode();
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
        Intent intent = new Intent(this, GameActivityMulti.class);
        intent.putExtra("resId", R.drawable.dragon_avatar);
        startActivity(intent);
    }

    public void openSinglePlayerMode() {
        Intent intent = new Intent(this, HomeScreenSinglePlayerChooseCharacter.class);
        startActivity(intent);
    }

    public void openMultiPlayerChooseCharacterPlayerOne() {
        Intent intent = new Intent(this, HomeScreenMultiPlayerChooseCharacterPlayerOne.class);
        startActivity(intent);
    }
}