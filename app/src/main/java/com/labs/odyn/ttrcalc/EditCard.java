package com.labs.odyn.ttrcalc;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class EditCard extends Card {

    protected String pName;

    //Globals
    Globals g = new Globals().getInstance();

    public EditCard(Context context, int player){
        this(context);
        pName = g.getPlayerNames(player);;
    }

    public EditCard(Context context) {
        super(context, R.layout.card_edit);
    }



    @Override
    public void setupInnerViewElements(ViewGroup parent, View view){
        //Retrieve elements
        EditText editName = (EditText) view.findViewById(R.id.editTitle);

        editName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE){

                }
                return handled;
            }
        });

        editName.setHint(pName);
    }

    public void setName (int player){
        pName = g.getPlayerNames(player);
    }
}
