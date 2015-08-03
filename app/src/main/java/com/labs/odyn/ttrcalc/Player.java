package com.labs.odyn.ttrcalc;

public class Player {

    //Player Id Number
    private int id;

    public void setId(int ID){
        id = ID;
    }

    public int getId() {
        return id;
    }

    //Player Name
    private String name;

    public void setName(String pName){
        name = pName;
    }

    public String getName(){
        return name;
    }

    //Player Trains Remaining
    private int trains;

    public void setTrains(int pTrains) {
        trains = pTrains;
    }

    public int getTrains() {
        return trains;
    }

    //Player Score
    private int score;

    public void setScore(int pScore){
        score = pScore;
    }

    public int getScore(){
        return score;
    }

    //Player Color Index
    private int color;

    public void setColor(int pColor){
        color = pColor;
    }

    public int getColor() {
        return color;
    }

    //Active Player
    private boolean isActive;

    public void setIsActive(boolean pIsActive) {
        isActive = pIsActive;
    }

    public boolean getIsActive(){
        return isActive;
    }
}
