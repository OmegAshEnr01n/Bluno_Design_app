package com.example.shobhit.design_app;


import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Shobhit on 3/11/2016.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter
{
    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public ViewPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragments.get(position);
    }

    public void ADDFRAGMENTS(Fragment fragments,String tabTitles)
    {
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);

    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
