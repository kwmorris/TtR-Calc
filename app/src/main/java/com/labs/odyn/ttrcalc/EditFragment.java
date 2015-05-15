package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class EditFragment extends Fragment {

    private static Globals g = new Globals().getInstance();

    private static EditCard cardEdit1;
    private static EditCard cardEdit2;
    private static EditCard cardEdit3;
    private static EditCard cardEdit4;
    private static EditCard cardEdit5;

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

        cardEdit1 = createCard(0);
        cardEdit2 = createCard(1);
        cardEdit3 = createCard(2);
        cardEdit4 = createCard(3);
        cardEdit5 = createCard(4);

        cardEdit1.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
            }
        });

        cardEdit2.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
            }
        });

        cardEdit3.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
            }
        });

        cardEdit4.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
            }
        });

        cardEdit5.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
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
}
