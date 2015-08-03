package com.labs.odyn.ttrcalc;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends FragmentActivity {

    public static Player player1 = new Player();
    public static Player player2 = new Player();
    public static Player player3 = new Player();
    public static Player player4 = new Player();
    public static Player player5 = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Initialize Player1's attibutes
        player1.setId(1);
        player1.setName("Player1");
        player1.setTrains(10);
        player1.setScore(111);
        player1.setColor(1);

        //Initialize Player2's attibutes
        player2.setId(2);
        player2.setName("Player2");
        player2.setTrains(20);
        player2.setScore(222);
        player2.setColor(2);

        //Initialize Player3's attibutes
        player3.setId(3);
        player3.setName("Player3");
        player3.setTrains(30);
        player3.setScore(333);
        player3.setColor(3);

        //Initialize Player4's attibutes
        player4.setId(4);
        player4.setName("Player4");
        player4.setTrains(40);
        player4.setScore(444);
        player4.setColor(4);

        //Initialize Player5's attibutes
        player5.setId(5);
        player5.setName("Player5");
        player5.setTrains(50);
        player5.setScore(555);
        player5.setColor(5);

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
