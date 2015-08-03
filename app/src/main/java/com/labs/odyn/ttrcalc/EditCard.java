package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import it.gmariotti.cardslib.library.internal.Card;

public class EditCard extends Card {

    protected String pName;
    protected Player player;
    protected int tColor;
    protected EditText editName;


    public EditCard(Context context, Player p){
        this(context);
        player = p;
    }

    public EditCard(Context context) {
        super(context, R.layout.card_edit);
    }

    @Override
    public void setupInnerViewElements(final ViewGroup parent, View view){
        //Retrieve elements
        editName = (EditText) view.findViewById(R.id.editTitle);

        pName = player.getName();

        editName.setHint(pName);
        editName.setTextColor(tColor);

        Button applyButton = (Button) view.findViewById(R.id.editButton);

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempName = editName.getText().toString();

                if (!tempName.matches("")) {
                    pName = tempName;
                    editName.setText("");
                    editName.setHint(pName);
                    player.setName(pName);
                }

                ScoreboardFragment.updateCard(player);
            }
        });
    }

    public void setTextColor (int color){
        tColor = color;
    }
}
