package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ScoreboardFragment extends Fragment {

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scoreboard, container, false);
        TextView placeHolder = (TextView) view.findViewById(R.id.placeHolderSB);
        placeHolder.setText("Place Holder Scoreboard");
        return view;

    }
}
