package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class PlayerCard extends Card {

    protected String pName;
    protected int pScore;

    //Globals
    Globals g = new Globals().getInstance();

    public PlayerCard(Context context, int player){
        this(context);
        pName = g.getPlayerNames(player);
        pScore = g.getPlayerScores(player);
    }

    public PlayerCard(Context context) {
        super(context, R.layout.card_player);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view){
        //Retrieve elements
        TextView cardName = (TextView) view.findViewById(R.id.cardTitle);
        TextView cardScore = (TextView) view.findViewById(R.id.cardScore);

        cardName.setText(pName);
        cardScore.setText(String.valueOf(pScore));
    }

    public void setName (int player){
        pName = g.getPlayerNames(player);
    }

    public void setScore (int player){
        pScore = g.getPlayerScores(player);
    }
}
