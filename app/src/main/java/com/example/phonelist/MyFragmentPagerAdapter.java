package com.example.phonelist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

/**
 * Created by lenovo on 2017/12/20.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] mtitles = new String[]{"联系人","收藏夹"};

    @Override
    public Fragment getItem(int position) {
        if (position == 1){
            return new collection();
        }
        return new phonelist();
    }


    public int getCount() {
        //此处返回Tab的数目
        return mtitles.length;
    }

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mtitles[position];
    }
}
