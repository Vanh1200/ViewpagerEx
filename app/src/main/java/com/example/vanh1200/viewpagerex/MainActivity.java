package com.example.vanh1200.viewpagerex;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int FIRST_FRAGMENT = 0;
    private static final int SECOND_FRAGMENT = 1;
    private static final int THIRD_FRAGMENT = 2;
    private TabLayout mMainTabLayout;
    private ViewPager mMainViewPager;
    private ViewpagerMainAdapter mMainAdapter;
    private ArrayList<Fragment> mFragments;
    private int[] mTabIcons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initFragments();
        initViewpager();
    }

    private void initViewpager() {
        mTabIcons = new int[]{R.drawable.ic_account_circle_white_24dp,
                R.drawable.ic_search_white_24dp,
                R.drawable.ic_cloud_download_white_24dp};
        mMainAdapter = new ViewpagerMainAdapter(getSupportFragmentManager());
        mMainAdapter.setFragments(mFragments);
        mMainViewPager.setAdapter(mMainAdapter);
        mMainTabLayout.setupWithViewPager(mMainViewPager);
        mMainTabLayout.getTabAt(FIRST_FRAGMENT).setIcon(mTabIcons[FIRST_FRAGMENT]);
        mMainTabLayout.getTabAt(SECOND_FRAGMENT).setIcon(mTabIcons[SECOND_FRAGMENT]);
        mMainTabLayout.getTabAt(THIRD_FRAGMENT).setIcon(mTabIcons[THIRD_FRAGMENT]);
    }

    private void initFragments() {
        mFragments = new ArrayList<>();
        mFragments.add(new FirstFragment());
        mFragments.add(new SecondFragment());
        mFragments.add(new ThirdFragment());
    }

    private void initViews() {
        mMainTabLayout = findViewById(R.id.tab_layout_main);
        mMainViewPager = findViewById(R.id.view_pager_main);
    }
}
