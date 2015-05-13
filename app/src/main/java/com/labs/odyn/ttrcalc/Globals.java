package com.labs.odyn.ttrcalc;

public class Globals {
    private static Globals instance;

    private void Globals (){}

    public Globals getInstance(){
        if (instance == null){
            //Create the instance
            instance = new Globals();
        }
        return instance;
    }

    //Set and Get playerNames
    private static String[] playerNames = new String[5];

    public void setPlayerNames(String[] pNames){
        playerNames = pNames;
    }

    public void setPlayerNames(String pName, int pos){
        playerNames[pos] = pName;
    }

    public String[] getPlayerNames(){
        return playerNames;
    }

    public String getPlayerNames(int pos){
        return playerNames[pos];
    }

    //Set and Get playerScores
    private static int[] playerScores = new int[5];

    public void setPlayerScores(int[] pScores){
        playerScores = pScores;
    }

    public void setPlayerScores(int pScore, int pos){
        playerScores[pos] = pScore;
    }

    public int[] getPlayerScores(){
        return playerScores;
    }

    public int getPlayerScores(int pos){
        return playerScores[pos];
    }

    //Set and Get playerColor
    private String[] playerColor = new String[5];
}
