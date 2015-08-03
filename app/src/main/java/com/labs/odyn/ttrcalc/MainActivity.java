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

        for (int i = 1; i < 6; i++){
            switch (i){
                case 1:
                    player1.setId(1);
                    player1.setName("Player1");
                    player1.setScore(1);
                    player1.setColor(1);
                    break;
                case 2:
                    player2.setId(2);
                    player2.setName("Player2");
                    player2.setScore(2);
                    player2.setColor(2);
                    break;
                case 3:
                    player3.setId(3);
                    player3.setName("Player3");
                    player3.setScore(3);
                    player3.setColor(3);
                    break;
                case 4:
                    player4.setId(4);
                    player4.setName("Player4");
                    player4.setScore(4);
                    player4.setColor(4);
                    break;
                case 5:
                    player5.setId(5);
                    player5.setName("Player5");
                    player5.setScore(5);
                    player5.setColor(5);
                    break;
            }
        }

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
