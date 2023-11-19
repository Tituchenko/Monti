package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    Player player_neverChange=new Player("Игрок никогда не меняет дверь",3,false);
    Player player_alwaysChange=new Player("Игрок всегда меняет дверь",3,true);
    Game game=new Game(3);
    for (int i = 0; i < 10000; i++) {
            game.turn();
            player_neverChange.turn();
            player_alwaysChange.turn();
            player_neverChange.SecondTurn(game.getLoseDore(player_neverChange.getCurrentChoice()));
            player_alwaysChange.SecondTurn(game.getLoseDore(player_alwaysChange.getCurrentChoice()));
            player_neverChange.saveResult(game.getResult(player_neverChange.getCurrentChoice()));
            player_alwaysChange.saveResult(game.getResult(player_alwaysChange.getCurrentChoice()));
    }
    player_neverChange.printStatistic();
    player_alwaysChange.printStatistic();


    }

}