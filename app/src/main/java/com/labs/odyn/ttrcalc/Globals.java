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



}
