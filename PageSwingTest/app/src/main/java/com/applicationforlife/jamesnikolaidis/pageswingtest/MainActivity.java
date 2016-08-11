package com.applicationforlife.jamesnikolaidis.pageswingtest;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SlidingPaneLayout;

import com.applicationforlife.jamesnikolaidis.Swip.SlidingTabLayout;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager = (ViewPager)super.findViewById(R.id.View_Pager);
        pager.setAdapter( new MyFragmentAdapter(getSupportFragmentManager(),MainActivity.this));

        SlidingTabLayout slide = (SlidingTabLayout) super.findViewById(R.id.sliding_tabs);

        slide.setViewPager(pager);

    }
}
