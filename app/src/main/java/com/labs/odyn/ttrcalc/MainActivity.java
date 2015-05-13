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

        //Initialize the ViewPager and set its adapter
        ViewPager tabPager = (ViewPager) findViewById(R.id.tabPager);
        tabPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //Give the PagerSlidingTabStrip the ViewPager
        PagerSlidingTabStrip tabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabStrip);
        //Attach the ViewPager to the tabStrip
        tabStrip.setViewPager(tabPager);
    }
}
