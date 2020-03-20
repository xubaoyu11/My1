package com.example.mode5.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.mode5.fragment.FragmentFive;
import com.example.mode5.fragment.FragmentFour;
import com.example.mode5.fragment.FragmentOne;
import com.example.mode5.fragment.FragmentThree;
import com.example.mode5.fragment.FragmentTwo;

import java.util.ArrayList;

public class MainAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments =new ArrayList<>();
    private ArrayList<String> strings =new ArrayList<>();
    public MainAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new FragmentOne());
        fragments.add(new FragmentTwo());
        fragments.add(new FragmentThree());
        fragments.add(new FragmentFour());
        fragments.add(new FragmentFive());
        strings.add("最新");
        strings.add("婆媳");
        strings.add("房产");
        strings.add("仲裁");
        strings.add("北京");

    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
