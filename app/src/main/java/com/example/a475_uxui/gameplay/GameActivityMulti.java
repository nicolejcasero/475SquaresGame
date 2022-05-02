package com.example.a475_uxui.gameplay;

import androidx.appcompat.app.AppCompatActivity;
import com.example.a475_uxui.R;
import com.example.a475_uxui.gameplay.gameview.GameView;
import com.example.a475_uxui.gameplay.gameview.PlayersStateView;
import com.example.a475_uxui.gameplay.model.HumanPlayer;
import com.example.a475_uxui.gameplay.model.Player;
import com.example.a475_uxui.gameplay.singleplayer.CPUPlayer;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.Map;

import homescreen.HomeScreenChooseMode;

public class GameActivityMulti extends AppCompatActivity implements PlayersStateView {


    protected GameView gameView;
    protected TextView player1occupying, player2occupying, currentPlayerPointer;
    protected ImageView player1name, player2name;
    ImageButton homeButton;
    Player[] players;
    Integer[] playersOccupying = new Integer[]{0, 0};
    Player currentPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameView = (GameView) findViewById(R.id.gameView);
        gameView.setPlayersState(this);

        player1name = (ImageView) findViewById(R.id.player1name);
        player1name.setImageResource(R.drawable.dog_avatar); //set image
//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            int resId = bundle.getInt("resId");
//            player1name.setImageResource(resId);
//        }

        player2name = (ImageView) findViewById(R.id.player2name);
        player1occupying = (TextView) findViewById(R.id.player1occupying);
        player2occupying = (TextView) findViewById(R.id.player2occupying);
        currentPlayerPointer = (TextView) findViewById(R.id.playerNowPointer);

        homeButton = (ImageButton) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreen();
            }
        });

        players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2")};
        startGame(players);
    }

    public void openHomeScreen() {
        Intent intent = new Intent(this, HomeScreenChooseMode.class);
        startActivity(intent);
    }

    private void startGame(Player[] players) {
        gameView.startGame(players);
        updateState();
    }

    public void updateState() {
        runOnUiThread(new Runnable() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {
                if (currentPlayer == players[0]) {
                    currentPlayerPointer.setText("PLAYER 1 TURN");
                } else if (currentPlayer == players[1]) {
                    currentPlayerPointer.setText("PLAYER 2 TURN");
                }
                player1occupying.setText(String.valueOf(playersOccupying[0]));
                player2occupying.setText(String.valueOf(playersOccupying[1]));
            }
        });
    }

    @Override
    public void setCurrentPlayer(Player player) {
        currentPlayer = player;
        updateState();
    }

    @Override
    public void setPlayerOccupyingBoxesCount(Map<Player, Integer> player_occupyingBoxesCount_map) {
        playersOccupying[0] = (player_occupyingBoxesCount_map.get(players[0]));
        playersOccupying[1] = (player_occupyingBoxesCount_map.get(players[1]));
        updateState();
    }

    @Override
    public void setWinner(final Player winner) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new AlertDialog.Builder(GameActivityMulti.this)
                        .setTitle("Squares")
                        .setMessage(winner.getName() + " Wins!")
                        .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                recreate();
                            }
                        })
                        .setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).show();
            }
        });
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

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_new) {
//            runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setTitle("Dots And Boxes")
//                            .setMessage("New game versus")
//                            .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
//                                public void onClick(DialogInterface dialog, int which) {
//                                    new AlertDialog.Builder(MainActivity.this)
//                                            .setTitle("Who goes first?")
//                                            .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
//                                                @Override
//                                                public void onClick(DialogInterface dialogInterface, int i) {
//                                                    players = new Player[]{new RandomAIPlayer("Computer"),
//                                                            new HumanPlayer("Human")};
//                                                    startGame(players);
//
//                                                    player1name.setText("Computer");
//                                                    player2name.setText("Human");
//                                                }
//                                            })
//                                            .setNegativeButton("Human", new DialogInterface.OnClickListener() {
//                                                @Override
//                                                public void onClick(DialogInterface dialogInterface, int i) {
//                                                    players = new Player[]{new HumanPlayer("Human"),
//                                                            new RandomAIPlayer("Computer")};
//                                                    startGame(players);
//
//                                                    player1name.setText("Human");
//                                                    player2name.setText("Computer");
//                                                }
//                                            }).show();
//                                }
//                            })
//                            .setNeutralButton("Human", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2")};
//                                    startGame(players);
//
//                                    player1name.setText("Player 1");
//                                    player2name.setText("Player 2");
//                                }
//                            }).show();
//                }
//            });
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
