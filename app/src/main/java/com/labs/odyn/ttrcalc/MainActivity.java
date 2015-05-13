package com.labs.odyn.ttrcalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the ViewPager and set its adapter
        ViewPager tabPager = (ViewPager) findViewById(R.id.tabPager);
        //tabPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }
}
