package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Default values
        String[] dNames = {"P1","P2","P3","P4","P5"};
        int[] dScores = //{0,0,0,0,0};
                {123,456,789,210,543};
        int[] dColors = //{0,0,0,0,0};
                {1,2,3,4,5};

        //Initialize Globals
        Globals g = new Globals().getInstance();
        g.setPlayerNames(dNames);
        g.setPlayerScores(dScores);
        g.setPlayerColors(dColors);

        //Initialize the ViewPager and set its adapter
        ViewPager tabPager = (ViewPager) findViewById(R.id.tabPager);
        tabPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));
        tabPager.setCurrentItem(1);

        //Give the PagerSlidingTabStrip the ViewPager
        PagerSlidingTabStrip tabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabStrip);
        //Attach the ViewPager to the tabStrip
        tabStrip.setViewPager(tabPager);
    }
}
