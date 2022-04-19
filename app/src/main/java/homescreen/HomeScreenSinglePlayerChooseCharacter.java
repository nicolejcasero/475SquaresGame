package homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a475_uxui.R;

public class HomeScreenSinglePlayerChooseCharacter extends AppCompatActivity {

    private ImageView dog_avatar;
    private ImageView pig_avatar;
    private ImageView mouse_avatar;
    private ImageView dragon_avatar;
    private ImageView snake_avatar;
    private ImageView tiger_avatar;
    private ImageView multi_player_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_single_player_choose_character);

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

        mouse_avatar = (ImageView) findViewById(R.id.mouse_avatar);
        mouse_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectMouse();
            }
        });

        pig_avatar = (ImageView) findViewById(R.id.pig_avatar);
        pig_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPig();
            }
        });

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