package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class PlayerCard extends Card {

    protected String pName;
    protected int pScore;

    public PlayerCard(Context context, String playerName, int playerScore){
        this(context);
        pName = playerName;
        pScore = playerScore;
    }

    public PlayerCard(Context context) {
        super(context, R.layout.row_card);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view){
        //Retrieve elements
        TextView cardName = (TextView) view.findViewById(R.id.cardTitle);
        TextView cardScore = (TextView) view.findViewById(R.id.cardScore);

        cardName.setText(pName);
        cardScore.setText(String.valueOf(pScore));
    }

}
