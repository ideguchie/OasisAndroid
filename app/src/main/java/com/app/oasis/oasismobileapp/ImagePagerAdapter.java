package com.app.oasis.oasismobileapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Elliot on 10/17/2015.
 */
public class ImagePagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Integer> images;

    public ImagePagerAdapter(FragmentManager fm) {
        super(fm);
        images = new ArrayList<>();
        images.add(R.drawable.tea);
        images.add(R.drawable.popcorn);
        images.add(R.drawable.taro);
    }
    @Override
    public Fragment getItem(int i) {
        FeaturedFragment f = FeaturedFragment.newInstance();
        f.setImageList(images.get(i));
        return f;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
