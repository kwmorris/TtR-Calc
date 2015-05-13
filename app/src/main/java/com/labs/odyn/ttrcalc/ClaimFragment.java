package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ClaimFragment extends Fragment {

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_claim, container, false);
        TextView placeHolder = (TextView) view.findViewById(R.id.placeHolderC);
        placeHolder.setText("Place Holder Claim");
        return view;

    }
}
