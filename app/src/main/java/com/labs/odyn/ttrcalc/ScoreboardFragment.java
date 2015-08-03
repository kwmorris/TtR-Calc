package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class ScoreboardFragment extends Fragment {

    private static Player player1 = MainActivity.player1;
    private static Player player2 = MainActivity.player2;
    private static Player player3 = MainActivity.player3;
    private static Player player4 = MainActivity.player4;
    private static Player player5 = MainActivity.player5;

    private static PlayerCard cardPlayer1;
    private static PlayerCard cardPlayer2;
    private static PlayerCard cardPlayer3;
    private static PlayerCard cardPlayer4;
    private static PlayerCard cardPlayer5;

    public static ScoreboardFragment newInstance() {
        return new ScoreboardFragment();
    }

    public ScoreboardFragment() {
        // Required empty public constructor
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scoreboard, container, false);

        cardPlayer1 = createCard(player1);
        cardPlayer2 = createCard(player2);
        cardPlayer3 = createCard(player3);
        cardPlayer4 = createCard(player4);
        cardPlayer5 = createCard(player5);

        cardPlayer1.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Player aPlayer = findActivePlayer();
                if (aPlayer == player1) {
                    deactivatePlayer(player1);
                } else {
                    switchActivePlayers(player1, aPlayer);
                }
            }
        });

        cardPlayer2.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Player aPlayer = findActivePlayer();
                if (aPlayer == player2) {
                    deactivatePlayer(player2);
                } else {
                    switchActivePlayers(player2, aPlayer);
                }
            }
        });

        cardPlayer3.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Player aPlayer = findActivePlayer();
                if (aPlayer == player3) {
                    deactivatePlayer(player3);
                } else {
                    switchActivePlayers(player3, aPlayer);
                }
            }
        });

        cardPlayer4.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Player aPlayer = findActivePlayer();
                if (aPlayer == player4) {
                    deactivatePlayer(player4);
                } else {
                    switchActivePlayers(player4, aPlayer);
                }
            }
        });

        cardPlayer5.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Player aPlayer = findActivePlayer();
                if (aPlayer == player5) {
                    deactivatePlayer(player5);
                } else {
                    switchActivePlayers(player5, aPlayer);
                }
            }
        });


        CardViewNative player1View = (CardViewNative) view.findViewById(R.id.cardPlayer1);
        CardViewNative player2View = (CardViewNative) view.findViewById(R.id.cardPlayer2);
        CardViewNative player3View = (CardViewNative) view.findViewById(R.id.cardPlayer3);
        CardViewNative player4View = (CardViewNative) view.findViewById(R.id.cardPlayer4);
        CardViewNative player5View = (CardViewNative) view.findViewById(R.id.cardPlayer5);

        player1View.setCard(cardPlayer1);
        player2View.setCard(cardPlayer2);
        player3View.setCard(cardPlayer3);
        player4View.setCard(cardPlayer4);
        player5View.setCard(cardPlayer5);

        return view;
    }

    private PlayerCard createCard(Player player) {
        PlayerCard card = new PlayerCard(this.getActivity(), player);

        card.setBackgroundColorResourceId(Colors.getColorPrimary(0));
        card.setTextColor(getResources().getColor(R.color.textDark));

        return card;
    }

    public static void updateCard(Player p){
        int pId = p.getId();
        int pColorId = p.getColor();
        int pColor;
        int tColor;
        boolean pActive = p.getIsActive();

        if (pActive){
            pColor = Colors.getColorDark(pColorId);
            tColor = Colors.getTextLight();
        } else {
            pColor = Colors.getColorPrimary(pColorId);
            tColor = Colors.getTextDark();
        }

        switch (pId) {
            case 1:
                cardPlayer1.updateCardData();
                cardPlayer1.setBackgroundColorResourceId(pColor);
                cardPlayer1.setTextColor(tColor);
                cardPlayer1.notifyDataSetChanged();
                break;
            case 2:
                cardPlayer2.updateCardData();
                cardPlayer2.setBackgroundColorResourceId(pColor);
                cardPlayer2.setTextColor(tColor);
                break;
            case 3:
                cardPlayer3.updateCardData();
                cardPlayer3.setBackgroundColorResourceId(pColor);
                cardPlayer3.setTextColor(tColor);
                break;
            case 4:
                cardPlayer4.updateCardData();
                cardPlayer4.setBackgroundColorResourceId(pColor);
                cardPlayer4.setTextColor(tColor);
                break;
            case 5:
                cardPlayer5.updateCardData();
                cardPlayer5.setBackgroundColorResourceId(pColor);
                cardPlayer5.setTextColor(tColor);
                cardPlayer5.notifyDataSetChanged();
                break;
        }
    }

    private void switchActivePlayers (Player newAPlayer, Player oldAPlayer){
        if (oldAPlayer != null){
            deactivatePlayer(oldAPlayer);
        }

        activatePlayer(newAPlayer);
    }

    private void deactivatePlayer (Player p){
        p.setIsActive(false);
        updateCard(p);
    }

    private void activatePlayer (Player p){
        p.setIsActive(true);
        updateCard(p);
    }

    public Player findActivePlayer(){
        if (player1.getIsActive()) {
            return player1;
        }
        else if (player2.getIsActive()) {
            return player2;
        }
        else if (player3.getIsActive()) {
            return player3;
        }
        else if (player4.getIsActive()) {
            return player4;
        }
        else if (player5.getIsActive()) {
            return player5;
        }
        else {
            return null;
        }
    }
}
