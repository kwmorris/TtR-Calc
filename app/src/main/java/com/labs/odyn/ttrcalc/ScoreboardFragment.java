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

    private static PlayerCard cardPlayer1;
    private static PlayerCard cardPlayer2;
    private static PlayerCard cardPlayer3;
    private static PlayerCard cardPlayer4;
    private static PlayerCard cardPlayer5;

    //private static CardViewNative

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

        cardPlayer1.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateActiveCard(1);
            }
        });

        cardPlayer2.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateActiveCard(2);
            }
        });

        cardPlayer3.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateActiveCard(3);
            }
        });

        cardPlayer4.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateActiveCard(4);
            }
        });

        cardPlayer5.setOnClickListener(new PlayerCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                updateActiveCard(5);
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

    private PlayerCard createCard(int player) {
        PlayerCard card = new PlayerCard(this.getActivity(), player);

        card.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(player)));

        return card;
    }

    private void updateActiveCard (int clicked){
        int activePlayer = g.getActivePlayer();

        if (activePlayer == clicked){
            switch (clicked){
                case 1:
                    cardPlayer1.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer1.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer1.notifyDataSetChanged();
                    break;
                case 2:
                    cardPlayer2.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer2.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer2.notifyDataSetChanged();
                    break;
                case 3:
                    cardPlayer3.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer3.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer3.notifyDataSetChanged();
                    break;
                case 4:
                    cardPlayer4.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer4.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer4.notifyDataSetChanged();
                    break;
                case 5:
                    cardPlayer5.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(clicked - 1)));
                    cardPlayer5.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer5.notifyDataSetChanged();
                    break;
            }
            g.setActivePlayer(0);
        } else{
            switch (activePlayer){
                case 1:
                    cardPlayer1.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer1.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer1.notifyDataSetChanged();
                    break;
                case 2:
                    cardPlayer2.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer2.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer2.notifyDataSetChanged();
                    break;
                case 3:
                    cardPlayer3.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer3.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer3.notifyDataSetChanged();
                    break;
                case 4:
                    cardPlayer4.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer4.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer4.notifyDataSetChanged();
                    break;
                case 5:
                    cardPlayer5.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
                    cardPlayer5.setTextColor(getResources().getColor(R.color.textDark));
                    cardPlayer5.notifyDataSetChanged();
                    break;
            }
            switch (clicked){
                case 1:
                    cardPlayer1.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer1.setTextColor(getResources().getColor(R.color.textLight));
                    cardPlayer1.notifyDataSetChanged();
                    break;
                case 2:
                    cardPlayer2.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer2.setTextColor(getResources().getColor(R.color.textLight));
                    cardPlayer2.notifyDataSetChanged();
                    break;
                case 3:
                    cardPlayer3.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer3.setTextColor(getResources().getColor(R.color.textLight));
                    cardPlayer3.notifyDataSetChanged();
                    break;
                case 4:
                    cardPlayer4.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer4.setTextColor(getResources().getColor(R.color.textLight));
                    cardPlayer4.notifyDataSetChanged();
                    break;
                case 5:
                    cardPlayer5.setBackgroundColorResourceId(g.getColorDark(g.getPlayerColors(clicked - 1)));
                    cardPlayer5.setTextColor(getResources().getColor(R.color.textLight));
                    cardPlayer5.notifyDataSetChanged();
                    break;
            }
            g.setActivePlayer(clicked);
        }
    }

    public static void updateCardName(int player){
        switch (player) {
            case 0:
                cardPlayer1.setName(0);
                cardPlayer1.notifyDataSetChanged();
                break;
            case 1:
                cardPlayer2.setName(1);
                cardPlayer2.notifyDataSetChanged();
                break;
            case 2:
                cardPlayer3.setName(2);
                cardPlayer3.notifyDataSetChanged();
                break;
            case 3:
                cardPlayer4.setName(3);
                cardPlayer4.notifyDataSetChanged();
                break;
            case 4:
                cardPlayer5.setName(4);
                cardPlayer5.notifyDataSetChanged();
                break;
        }
    }

    public static void updateCardScore(int player){
        switch (player) {
            case 1:
                cardPlayer1.setScore(0);
                cardPlayer1.notifyDataSetChanged();
                break;
            case 2:
                cardPlayer1.setName(1);
                cardPlayer1.notifyDataSetChanged();
                break;
            case 3:
                cardPlayer1.setName(2);
                cardPlayer1.notifyDataSetChanged();
                break;
            case 4:
                cardPlayer1.setName(3);
                cardPlayer1.notifyDataSetChanged();
                break;
            case 5:
                cardPlayer1.setName(4);
                cardPlayer1.notifyDataSetChanged();
                break;
        }
    }

    public static void updateCardColor(int player){
        g.setActivePlayer(0);
        switch (player){
            case 0:
                cardPlayer1.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(player)));
                cardPlayer1.notifyDataSetChanged();
            break;
            case 1:
                cardPlayer2.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(player)));
                cardPlayer2.notifyDataSetChanged();
            break;
            case 2:
                cardPlayer3.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(player)));
                cardPlayer3.notifyDataSetChanged();
            break;
            case 3:
                cardPlayer4.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(player)));
                cardPlayer4.notifyDataSetChanged();
            break;
            case 4:
                cardPlayer5.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(player)));
                cardPlayer5.notifyDataSetChanged();
            break;
        }
    }
}
