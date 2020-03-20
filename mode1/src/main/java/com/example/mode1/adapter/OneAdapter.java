package com.example.mode1.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mode1.bean.MyBean;
import com.example.mode1.fragment.TowFragment;

import java.util.ArrayList;
import java.util.List;

public class OneAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private List<MyBean.ResultBean.SecondCategoryVoBean> list = new ArrayList<>();

    public OneAdapter(FragmentManager fm, List<MyBean.ResultBean.SecondCategoryVoBean> list) {
        super(fm);
        this.list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            TowFragment towFragment = new TowFragment();

            fragments.add(towFragment);
        }
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        MyBean.ResultBean.SecondCategoryVoBean secondCategoryVoBean = list.get(position);
        String name = secondCategoryVoBean.getName();
        return name;
    }
}
