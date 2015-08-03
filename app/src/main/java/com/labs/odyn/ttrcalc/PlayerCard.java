package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class PlayerCard extends Card {

    protected Player player;
    protected int tColor;
    protected int trainColor;

    protected TextView cardName;
    protected TextView cardTrains;
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
        cardTrains = (TextView) view.findViewById(R.id.cardTrains);
        cardScore = (TextView) view.findViewById(R.id.cardScore);

        updateCardData();
    }

    public void updateCardData(){
        if (player.getIsActive()){
            tColor = R.color.textLight;
        } else {
            tColor = R.color.textDark;
        }

        if (player.getTrains() > 50) {
            trainColor = tColor;
        } else if (player.getIsActive()) {
            trainColor = R.color.textLowLight;
        } else {
            trainColor = R.color.textLowDark;
        }

        cardName.setText(player.getName());
        cardName.setTextColor(mContext.getResources().getColor(tColor));

        cardTrains.setText(String.valueOf(player.getTrains()));
        cardTrains.setTextColor(mContext.getResources().getColor(trainColor));

        cardScore.setText(String.valueOf(player.getScore()));
        cardScore.setTextColor(mContext.getResources().getColor(tColor));
    }

    public void setTextColor(int color){
        tColor = color;
    }
}
