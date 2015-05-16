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
    private int[] playerColors = new int[5];

    public void setPlayerColors(int[] pColors){
        playerColors = pColors;
    }

    public void setPlayerColors(int pColor, int pos){
        playerColors[pos] = pColor;
    }

    public int[] getPlayerColors(){
        return playerColors;
    }

    public int getPlayerColors(int pos){
        return playerColors[pos];
    }

    //Color options
    private int[] colorPrimary = {R.color.colorPrimary, R.color.blackPrimary, R.color.redPrimary,
            R.color.yellowPrimary, R.color.greenPrimary, R.color.bluePrimary};

    private int[] colorDark = {R.color.colorDark, R.color.blackDark, R.color.redDark,
            R.color.yellowDark, R.color.greenDark, R.color.blueDark};

    private int[] colorLight = {R.color.colorPrimary, R.color.blackLight, R.color.redLight,
            R.color.yellowLight, R.color.greenLight, R.color.blueLight};

    /*public int[] getColorLight(){
        return colorLight;
    }*/

    public int getColorLight(int pos){
        return colorLight[pos];
    }

    /*public int[] getColorPrimary(){
        return colorPrimary;
    }*/

    public int getColorPrimary(int pos){
        return colorPrimary[pos];
    }

    /*public int[] getColorDark(){
        return colorDark;
    }*/

    public int getColorDark(int pos){
        return colorDark[pos];
    }

    //Set and Get the activePlayer
    private int activePlayer = 0;

    public void setActivePlayer (int aPlayer){
        activePlayer = aPlayer;
    }

    public int getActivePlayer (){
        return activePlayer;
    }

    //Set and Get edited players
    /*private boolean changedName = false;

    public void setChangedName(boolean bool){
        changedName = bool;
    }

    public boolean getChangedName(){
        return changedName;
    }

    private boolean[] changedNames = {false, false, false, false, false};

    public void setChangedNames(boolean[] bool){
        changedNames = bool;
    }

    public void setChangedNames(boolean bool, int player){
        changedNames[player] = bool;
    }

    public boolean[] getChangedNames(){
        return changedNames;
    }

    private boolean changedColor = false;

    public void setChangedColor(boolean bool){
        changedColor = bool;
    }

    public boolean getChangedColor(){
        return changedColor;
    }

    private boolean[] changedColors = {false, false, false, false, false};

    public void setChangedColors(boolean[] bool){
        changedColors = bool;
    }

    public void setChangedColors(boolean bool, int player){
        changedColors[player] = bool;
    }

    public boolean[] getChangedColors(){
        return changedColors;
    }

    private boolean changedScore = false;

    public void setChangedScore(boolean bool){
        changedScore = bool;
    }

    public boolean getChangedScore(){
        return changedScore;
    }

    private boolean[] changedScores = {false, false, false, false, false};

    public void setChangedScores(boolean[] bool){
        changedScores = bool;
    }

    public void setChangedScores(boolean bool, int player){
        changedScores[player] = bool;
    }

    public boolean[] getChangedScores(){
        return changedScores;
    }*/
}
