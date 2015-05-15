package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class EditFragment extends Fragment {

    private static Globals g = new Globals().getInstance();

    private static EditCard cardEdit1;
    private static EditCard cardEdit2;
    private static EditCard cardEdit3;
    private static EditCard cardEdit4;
    private static EditCard cardEdit5;

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

        tempColors = g.getPlayerColors();

        cardEdit1 = createCard(0);
        cardEdit2 = createCard(1);
        cardEdit3 = createCard(2);
        cardEdit4 = createCard(3);
        cardEdit5 = createCard(4);

        cardEdit1.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(0);
            }
        });

        cardEdit2.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(1);
            }
        });

        cardEdit3.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(2);
            }
        });

        cardEdit4.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(3);
            }
        });

        cardEdit5.setOnClickListener(new EditCard.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                changeColor(4);
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

    private EditCard createCard(int player){
        EditCard card = new EditCard(this.getActivity(), player);

        card.setBackgroundColorResourceId(g.getColorLight(g.getPlayerColors(player)));

        return card;
    }

    private void changeColor(int player){
        int color = tempColors[player];
        color++;

        if (color > 5){
            color = 0;
        }

        switch (player){
            case 0:
                cardEdit1.setBackgroundColorResourceId(g.getColorLight(color));
                cardEdit1.notifyDataSetChanged();
                break;
            case 1:
                cardEdit2.setBackgroundColorResourceId(g.getColorLight(color));
                cardEdit2.notifyDataSetChanged();
                break;
            case 2:
                cardEdit3.setBackgroundColorResourceId(g.getColorLight(color));
                cardEdit3.notifyDataSetChanged();
                break;
            case 3:
                cardEdit4.setBackgroundColorResourceId(g.getColorLight(color));
                cardEdit4.notifyDataSetChanged();
                break;
            case 4:
                cardEdit5.setBackgroundColorResourceId(g.getColorLight(color));
                cardEdit5.notifyDataSetChanged();
                break;
        }

        tempColors[player] = color;
    }

    public static void setColor(int player){
        g.setPlayerColors(tempColors[player], player);
    }

}
