package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class ScoreboardFragment extends Fragment {

    private static Globals g = new Globals().getInstance();

    private static Card cardPlayer1;
    private static Card cardPlayer2;
    private static Card cardPlayer3;
    private static Card cardPlayer4;
    private static Card cardPlayer5;

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

        cardPlayer1 = createCard(0);
        cardPlayer2 = createCard(1);
        cardPlayer3 = createCard(2);
        cardPlayer4 = createCard(3);
        cardPlayer5 = createCard(4);

        cardPlayer1.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateCards(1);
            }
        });

        cardPlayer2.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateCards(2);
            }
        });

        cardPlayer3.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateCards(3);
            }
        });

        cardPlayer4.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateCards(4);
            }
        });

        cardPlayer5.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateCards(5);
            }
        });

        /*TODO: Implement?
        //Call replace
        card3.setInnerLayout(R.layout.carddemo_suggested_inner_content);
        cardView3 = (CardViewNative) getActivity().findViewById(R.id.carddemo_card_changevalue_id3);
        cardView3.replaceCard(card3);
         */


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

    private PlayerCard createCard(int player) {
        PlayerCard card = new PlayerCard(this.getActivity(), g.getPlayerNames(player), g.getPlayerScores(0));

        card.setBackgroundColorResourceId(g.getColorPrimary(0));

        return card;
    }

    private void updateCards (int clicked){
        int activePlayer = g.getActivePlayer();

        if (activePlayer == clicked){
            switch (clicked){
                case 1:
                    cardPlayer1.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer1.notifyDataSetChanged();
                    break;
                case 2:
                    cardPlayer2.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer2.notifyDataSetChanged();
                    break;
                case 3:
                    cardPlayer3.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer3.notifyDataSetChanged();
                    break;
                case 4:
                    cardPlayer4.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer4.notifyDataSetChanged();
                    break;
                case 5:
                    cardPlayer5.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer5.notifyDataSetChanged();
                    break;
            }
            g.setActivePlayer(0);
        } else{
            switch (activePlayer){
                case 1:
                    cardPlayer1.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer1.notifyDataSetChanged();
                    break;
                case 2:
                    cardPlayer2.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer2.notifyDataSetChanged();
                    break;
                case 3:
                    cardPlayer3.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer3.notifyDataSetChanged();
                    break;
                case 4:
                    cardPlayer4.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer4.notifyDataSetChanged();
                    break;
                case 5:
                    cardPlayer5.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer5.notifyDataSetChanged();
                    break;
            }
            switch (clicked){
                case 1:
                    cardPlayer1.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer1.notifyDataSetChanged();
                    break;
                case 2:
                    cardPlayer2.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer2.notifyDataSetChanged();
                    break;
                case 3:
                    cardPlayer3.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer3.notifyDataSetChanged();
                    break;
                case 4:
                    cardPlayer4.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer4.notifyDataSetChanged();
                    break;
                case 5:
                    cardPlayer5.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer5.notifyDataSetChanged();
                    break;
            }
            g.setActivePlayer(clicked);
        }
    }

    /*public void updateCards (int player, String pName){
        g.setPlayerNames(pName, player);
        switch (player){
            case 1:
                //cardPlayer1.
                break;
            case 2:
                cardPlayer2.setTitle(pName);
                break;
            case 3:
                cardPlayer3.setTitle(pName);
                break;
            case 4:
                cardPlayer4.setTitle(pName);
                break;
            case 5:
                cardPlayer5.setTitle(pName);
                break;
        }
    }

    private void updateCards (int player, int pScore){
        switch (player){
            case 1:
                cardPlayer1.setTitle(g.getPlayerNames(0));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }*/
}
