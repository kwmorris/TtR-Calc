package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class EditFragment extends Fragment {

    private static EditCard cardEdit1;
    private static EditCard cardEdit2;
    private static EditCard cardEdit3;
    private static EditCard cardEdit4;
    private static EditCard cardEdit5;

    private static Player player1 = MainActivity.player1;
    private static Player player2 = MainActivity.player2;
    private static Player player3 = MainActivity.player3;
    private static Player player4 = MainActivity.player4;
    private static Player player5 = MainActivity.player5;

    private static int[] tempColors;

    public static EditFragment newInstance() {
        return new EditFragment();
    }

    public EditFragment() {
        // Required empty public constructor
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit, container, false);

        cardEdit1 = createCard(player1);
        cardEdit2 = createCard(player2);
        cardEdit3 = createCard(player3);
        cardEdit4 = createCard(player4);
        cardEdit5 = createCard(player5);

        cardEdit1.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(player1, 1);
            }
        });

        cardEdit2.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(player2, 2);
            }
        });

        cardEdit3.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(player3, 3);
            }
        });

        cardEdit4.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(player4, 4);
            }
        });

        cardEdit5.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(player5, 5);
            }
        });


        CardViewNative edit1View = (CardViewNative) view.findViewById(R.id.cardEdit1);
        CardViewNative edit2View = (CardViewNative) view.findViewById(R.id.cardEdit2);
        CardViewNative edit3View = (CardViewNative) view.findViewById(R.id.cardEdit3);
        CardViewNative edit4View = (CardViewNative) view.findViewById(R.id.cardEdit4);
        CardViewNative edit5View = (CardViewNative) view.findViewById(R.id.cardEdit5);

        edit1View.setCard(cardEdit1);
        edit2View.setCard(cardEdit2);
        edit3View.setCard(cardEdit3);
        edit4View.setCard(cardEdit4);
        edit5View.setCard(cardEdit5);

        return view;
    }

    private EditCard createCard(Player player){
        EditCard card = new EditCard(this.getActivity(), player);

        card.setBackgroundColorResourceId(Colors.getColorLight(player.getColor()));
        card.setTextColor(getResources().getColor(R.color.textDark));

        return card;
    }

    private void changeColor(Player p, int pId){
        int color = p.getColor();
        color++;

        if (color > 5){
            color = 0;
        }

        switch (pId){
            case 1:
                cardEdit1.setBackgroundColorResourceId(Colors.getColorLight(color));
                cardEdit1.notifyDataSetChanged();
                break;
            case 2:
                cardEdit2.setBackgroundColorResourceId(Colors.getColorLight(color));
                cardEdit2.notifyDataSetChanged();
                break;
            case 3:
                cardEdit3.setBackgroundColorResourceId(Colors.getColorLight(color));
                cardEdit3.notifyDataSetChanged();
                break;
            case 4:
                cardEdit4.setBackgroundColorResourceId(Colors.getColorLight(color));
                cardEdit4.notifyDataSetChanged();
                break;
            case 5:
                cardEdit5.setBackgroundColorResourceId(Colors.getColorLight(color));
                cardEdit5.notifyDataSetChanged();
                break;
        }

        p.setColor(color);
    }

}
