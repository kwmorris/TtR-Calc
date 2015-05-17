package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ClaimFragment extends Fragment {

    private static Globals g = new Globals().getInstance();

    private static ClaimCard claimCard;

    public static ClaimFragment newInstance() {
        return new ClaimFragment();
    }

    public ClaimFragment() {
        // Required empty public constructor
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_claim, container, false);

        claimCard = new ClaimCard(this.getActivity());

        return view;

    }

    public static void updateCard (){
        int activePlayer = g.getActivePlayer();
        if (activePlayer == 0){
            claimCard.setBackgroundColorResourceId(g.getColorPrimary(0));
        } else {
            claimCard.setBackgroundColorResourceId(g.getColorPrimary(g.getPlayerColors(activePlayer - 1)));
        }

        claimCard.updateCard();
    }
}
