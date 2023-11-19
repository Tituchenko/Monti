package org.example;

public class Game {
    private Integer maxRooms;
    private int winRoom;
    public void turn(){
        winRoom=(int)(Math.random()*maxRooms+1);
    }

    public int getLoseDore(int PlayerChoice){
        int loseDoor;
        do {
            loseDoor= (int)(Math.random()*maxRooms+1);
        } while (loseDoor==winRoom || loseDoor==PlayerChoice);
        return loseDoor;

    }

    public Game(Integer maxRooms) {
        this.maxRooms = maxRooms;
    }
    public boolean getResult (int PlayerChoice){
        return PlayerChoice==winRoom;
    }
    public int getWinRoom() {
        return winRoom;
    }
}
