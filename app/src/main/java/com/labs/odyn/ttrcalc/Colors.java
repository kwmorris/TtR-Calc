package com.labs.odyn.ttrcalc;

public class Colors {
    private static Colors instance;

    private void Globals (){}

    public Colors getInstance(){
        if (instance == null){
            //Create the instance
            instance = new Colors();
        }
        return instance;
    }

    //Color options
    private static int[] colorPrimary = {R.color.colorPrimary, R.color.blackPrimary, R.color.redPrimary,
            R.color.yellowPrimary, R.color.greenPrimary, R.color.bluePrimary};

    private static int[] colorDark = {R.color.colorDark, R.color.blackDark, R.color.redDark,
            R.color.yellowDark, R.color.greenDark, R.color.blueDark};

    private static int[] colorLight = {R.color.colorPrimary, R.color.blackLight, R.color.redLight,
            R.color.yellowLight, R.color.greenLight, R.color.blueLight};

    private static int textDark = R.color.textDark;

    private static int textLight = R.color.textLight;

    public static int getColorLight(int pos){
        return colorLight[pos];
    }

    public static int getColorPrimary(int pos){
        return colorPrimary[pos];
    }

    public static int getColorDark(int pos){
        return colorDark[pos];
    }

    public static int getTextDark() {
        return textDark;
    }

    public static int getTextLight() {
        return textLight;
    }
}
