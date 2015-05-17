package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class ClaimCard extends Card {

    protected int aPlayer;
    protected int activePlayer;

    protected String playerName;
    protected int playerScore;

    protected int routeValue;
    protected RadioGroup routeGroup;

    protected Button claimButton;

    //Globals
    Globals g = new Globals().getInstance();

    public ClaimCard(Context context) {
        super(context, R.layout.card_claim_alpha);
    }

    public void setupInnerViewElements(ViewGroup parent, View view){
        //Retrieve elements
        TextView cardName = (TextView) view.findViewById(R.id.cardTitle);
        TextView cardScore = (TextView) view.findViewById(R.id.cardScore);

        updateCard();

        cardName.setText(playerName);
        cardScore.setText(String.valueOf(playerScore));

        routeGroup = (RadioGroup) view.findViewById(R.id.routeGroup);

        routeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.routeLengthOne:
                        routeValue = 1;
                        break;
                    case R.id.routeLengthTwo:
                        routeValue = 2;
                        break;
                    case R.id.routeLengthThree:
                        routeValue = 4;
                        break;
                    case R.id.routeLengthFour:
                        routeValue = 7;
                        break;
                    case R.id.routeLengthFive:
                        routeValue = 10;
                        break;
                    case R.id.routeLengthSix:
                        routeValue = 15;
                        break;
                }
            }
        });

        claimButton = (Button) view.findViewById(R.id.claimButton);

        claimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aPlayer > 0) {

                    playerScore += routeValue;

                    g.setPlayerScores(playerScore, activePlayer);
                }
            }
        });
    }

    public void updateCard() {
        aPlayer = g.getActivePlayer();

        if (aPlayer > 0){
            activePlayer = aPlayer - 1;

            playerName = g.getPlayerNames(activePlayer);
            playerScore = g.getPlayerScores(activePlayer);
        } else {
            playerName = "None Selected";
            playerScore = 0;
        }

        playerName = g.getPlayerNames(activePlayer);

        playerScore = g.getPlayerScores(activePlayer);
    }

    /*public void setName (){
        playerName = g.getPlayerNames(activePlayer);
    }

    public void setScore (){
        playerScore = g.getPlayerScores(activePlayer);
    }*/
}
