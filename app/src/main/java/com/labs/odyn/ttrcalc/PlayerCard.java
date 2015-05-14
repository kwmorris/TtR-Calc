package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class PlayerCard extends Card {

    protected TextView player;
    protected TextView score;

    public PlayerCard(Context context) {
        super(context, R.layout.row_card);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view){
        //Retrieve elements
        player = (TextView) view.findViewById(R.id.cardTitle);
        score = (TextView) view.findViewById(R.id.cardScore);
    }

    public void setPlayer(String pName){
        player.setText(pName);
    }

    public void setTitle(int pScore){
        score.setText(String.valueOf(pScore));
    }

}
