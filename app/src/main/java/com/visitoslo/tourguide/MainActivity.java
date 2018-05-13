package com.visitoslo.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);

        // Create an adapter to check which fragment to show on each page
        CustomFragmentPagerAdapter adapter = new CustomFragmentPagerAdapter(MainActivity.this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}
