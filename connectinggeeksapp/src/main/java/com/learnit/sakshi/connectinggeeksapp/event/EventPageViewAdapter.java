package com.learnit.sakshi.connectinggeeksapp.event;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by chanc on 11-01-2018.
 */

public class EventPageViewAdapter extends FragmentPagerAdapter {
    private String[] tabNames = { "Hackathons", "Workshops", "Coding"};



    public EventPageViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position < 0 || position >= tabNames.length)
            return null;

        return GenericEventFragment.newInstance(tabNames[position],"");
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position>= tabNames.length || position<0)
            return null;
        return tabNames[position];
    }

    @Override
    public int getCount() {
        return tabNames.length;
    }

    public String[] getTabNames() {
        return tabNames;
    }

    public void setTabNames(String[] tabNames) {
        this.tabNames = tabNames;
    }
}
