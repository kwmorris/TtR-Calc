package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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
        Card cardPlayer2 = createCard(R.layout.row_card, null, null);
        Card cardPlayer3 = createCard(R.layout.row_card, null, null);
        Card cardPlayer4 = createCard(R.layout.row_card, null, null);
        Card cardPlayer5 = createCard(R.layout.row_card, null, null);

        //cardPlayer1.setClickable(true);
        cardPlayer1.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                int color = g.getPlayerColors(0);
                color++;
                if (color > 5){
                    color = 0;
                }
                g.setPlayerColors(color, 0);
                card.setBackgroundColorResourceId(g.getColorPrimary(color));
                card.notifyDataSetChanged();

                Toast.makeText(getActivity(), "Card 1 clicked", Toast.LENGTH_SHORT).show();
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

        card.setBackgroundColorResourceId(g.getColorPrimary(0));

        return card;
    }
}
