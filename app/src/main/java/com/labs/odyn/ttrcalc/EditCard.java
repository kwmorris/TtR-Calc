package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import it.gmariotti.cardslib.library.internal.Card;

public class EditCard extends Card {

    protected String pName;
    protected int pNum;
    protected int tColor;

    //Globals
    Globals g = new Globals().getInstance();

    public EditCard(Context context, int player){
        this(context);
        pNum = player;
        pName = g.getPlayerNames(pNum);
    }

    public EditCard(Context context) {
        super(context, R.layout.card_edit);
    }

    @Override
    public void setupInnerViewElements(final ViewGroup parent, View view){
        //Retrieve elements
        final EditText editName = (EditText) view.findViewById(R.id.editTitle);

        editName.setHint(pName);
        editName.setTextColor(tColor);

        Button applyButton = (Button) view.findViewById(R.id.editButton);

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempName = editName.getText().toString();

                EditFragment.setColor(pNum);
                ScoreboardFragment.updateCardColor(pNum);

                if (!tempName.matches("")) {
                    pName = tempName;
                    editName.setText("");
                    editName.setHint(pName);
                    g.setPlayerNames(pName, pNum);
                    ScoreboardFragment.updateCardName(pNum);
                }
            }
        });
    }

    public void setName (int player){
        pName = g.getPlayerNames(player);
    }

    public void setTextColor (int color){
        tColor = color;
    }
}
