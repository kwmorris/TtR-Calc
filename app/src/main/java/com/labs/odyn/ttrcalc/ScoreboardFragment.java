package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.CardListView;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class ScoreboardFragment extends Fragment {

    private static Globals g = new Globals().getInstance();
    private static String[] playerNames = g.getPlayerNames();

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

        //Create a card for player1
        Card cardPlayer1 = createCard(R.layout.row_card, null, null);

        CardViewNative player1View = (CardViewNative) view.findViewById(R.id.cardPlayer1);
        player1View.setCard(cardPlayer1);

        return view;
    }

    private Card createCard(int layout, CardHeader header, CardThumbnail thumb) {
        Card card = new Card(this.getActivity(), layout);

        if (header != null) {
            //Attach header
            //CardHeader header = new CardHeader(this.getActivity());
            //header.setTitle("Hello World");
            card.addCardHeader(header);
        }

        if (thumb != null) {
            //Attach thumbnail
            //CardThumbnail thumb = new CardThumbnail(this.getActivity());
            //thumb.setDrawableResource(R.mipmap.ic_launcher);
            card.addCardThumbnail(thumb);
        }

        return card;
    }
}
