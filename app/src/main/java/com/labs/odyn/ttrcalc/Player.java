package com.labs.odyn.ttrcalc;

public class Player {

    //Player Id Number
    private static int id;

    public void setId(int ID){
        id = ID;
    }

    public int getId() {
        return id;
    }

    //Player Name
    private static String name;

    public void setName(String pName){
        name = pName;
    }

    public String getName(){
        return name;
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
