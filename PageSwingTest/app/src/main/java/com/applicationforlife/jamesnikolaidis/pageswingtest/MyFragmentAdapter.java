package com.applicationforlife.jamesnikolaidis.pageswingtest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by James Nikolaidis on 8/11/2016.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {
    String[] tabName= new String[]{"tab #1","tab #2"};
    Context context;

    public MyFragmentAdapter(FragmentManager fm,Context con) {
        super(fm);
        this.context = con;
    }



    @Override
    public Fragment getItem(int position) {

         if (position == 0){
             return new Fragment1();
         }else
             return new fragment_2();

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
         return tabName[position];
    }
}
