package com.example.a475_uxui.gameplay.gameview;
import com.example.a475_uxui.gameplay.model.Player;
import java.util.Map;

public interface PlayersStateView {
    void setCurrentPlayer(Player player);

    void setPlayerOccupyingBoxesCount(Map<Player, Integer> player_occupyingBoxesCount_map);

    void setWinner(Player winner);
}
