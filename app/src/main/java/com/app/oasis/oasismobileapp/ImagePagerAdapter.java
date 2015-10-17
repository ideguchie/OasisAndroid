package com.app.oasis.oasismobileapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Elliot on 10/17/2015.
 */
public class ImagePagerAdapter extends FragmentPagerAdapter {

    public ImagePagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new FeaturedFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putInt(FeaturedFragment.ARG_OBJECT, i + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
