package com.example.android.churchball;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jesserich on 1/17/18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;
    private String[] titles = new String[]{"Team A", "Team B"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return TeamAFragment.newInstance(0, "Team A");
            case 1: return TeamBFragment.newInstance(1, "Team B");
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
