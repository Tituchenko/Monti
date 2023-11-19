package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Player {
    private int maxRooms;
    private Map<Integer,Boolean> games = new HashMap<>();
    private Integer currentGame=0;
    private Integer currentChoice;
    private Boolean isChange;
    private String name;
    public Player( String name,int maxRooms,Boolean isChange) {
        this.isChange = isChange;
        this.name = name;
        this.maxRooms=maxRooms;
    }
    public void turn(){
        currentChoice=(int)(Math.random()*maxRooms+1);
    }
    public void SecondTurn(int loseDoor){
        if (isChange){
            int nextTurn;
            do {
                nextTurn=(int)(Math.random()*maxRooms+1);
            } while(nextTurn==currentChoice || nextTurn==loseDoor);
            currentChoice=nextTurn;
        }
    }
    public Integer getCurrentChoice() {
        return currentChoice;
    }
    public void saveResult(Boolean result){
        games.put(currentGame++,result);
    }
    public void printStatistic(){
        double countWin=Collections.frequency(games.values(),true);
        int persentWin= (int) Math.round(countWin/games.size()*100);
        System.out.println(name+" "+persentWin+"% побед "+(100-persentWin)+"% поражений.");
    }
}
