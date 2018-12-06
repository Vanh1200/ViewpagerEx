package com.example.vanh1200.viewpagerex;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewpagerMainAdapter extends FragmentPagerAdapter {
    private static final int FIRST_FRAGMENT = 0;
    private static final int SECOND_FRAGMENT = 1;
    private static final int THIRD_FRAGMENT = 2;
    private static final String TITLE_FIRST_FRAGMENT = "First";
    private static final String TITLE_SECOND_FRAGMENT = "Second";
    private static final String TITLE_THIRD_FRAGMENT = "Third";
    private ArrayList<Fragment> mFragments;

    public ArrayList<Fragment> getFragments() {
        return mFragments;
    }

    public void setFragments(ArrayList<Fragment> fragments) {
        mFragments = fragments;
    }

    public ViewpagerMainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case FIRST_FRAGMENT:
                return mFragments.get(FIRST_FRAGMENT);
            case SECOND_FRAGMENT:
                return mFragments.get(SECOND_FRAGMENT);
            case THIRD_FRAGMENT:
                return mFragments.get(THIRD_FRAGMENT);
            default:
                return mFragments.get(FIRST_FRAGMENT);
        }
    }

    @Override
    public int getCount() {
        return mFragments == null ? 0 : mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case FIRST_FRAGMENT:
                return TITLE_FIRST_FRAGMENT;
            case SECOND_FRAGMENT:
                return TITLE_SECOND_FRAGMENT;
            case THIRD_FRAGMENT:
                return TITLE_THIRD_FRAGMENT;
            default:
                return TITLE_FIRST_FRAGMENT;
        }
    }
}
