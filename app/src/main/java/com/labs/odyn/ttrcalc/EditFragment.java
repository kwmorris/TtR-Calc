package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class EditFragment extends Fragment {

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit, container, false);
        TextView placeHolder = (TextView) view.findViewById(R.id.placeHolderE);
        placeHolder.setText("Place Holder Edit");
        return view;

    }
}
