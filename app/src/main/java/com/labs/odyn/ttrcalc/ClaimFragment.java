package com.labs.odyn.ttrcalc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ClaimFragment extends Fragment {
    private static Player activePlayer;

    private static ClaimCard cardClaim;

    public static ClaimFragment newInstance() {
        return new ClaimFragment();
    }

    public ClaimFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_claim, container, false);



        return view;
    }
}
