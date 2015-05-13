package com.labs.odyn.ttrcalc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String[] tabTitles = {"Edit", "Scoreboard", "Claim"};

    public TabFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount(){
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int pos){
        if (pos == 0){
            return EditFragment.newInstance();
        } else if (pos == 2){
            return ClaimFragment.newInstance();
        } else {
            return ScoreboardFragment.newInstance();
        }
    }

    @Override
    public CharSequence getPageTitle(int pos){
        return tabTitles[pos];
    }
}
