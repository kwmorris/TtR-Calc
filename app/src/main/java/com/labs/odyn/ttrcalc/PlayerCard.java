package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class PlayerCard extends Card {

    protected Player player;
    protected static int tColor;

    protected TextView cardName;
    protected TextView cardScore;

    public PlayerCard(Context context, Player p){
        this(context);
        player = p;
    }

    public PlayerCard(Context context) {
        super(context, R.layout.card_player);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view){
        //Retrieve elements
        cardName = (TextView) view.findViewById(R.id.cardTitle);
        cardScore = (TextView) view.findViewById(R.id.cardScore);

        updateCardData();
    }

    public void updateCardData(){
        /*if (player.getIsActive()){
            tColor = R.color.textLight;
        } else {
            tColor = R.color.textDark;
        }*/

        cardName.setText(player.getName());
        cardName.setTextColor(tColor);
        cardScore.setText(String.valueOf(player.getScore()));
        cardScore.setTextColor(tColor);
    }

    public void setTextColor(int color){
        tColor = color;
    }
}
