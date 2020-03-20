package com.example.mode1.adapter;

import android.os.Bundle;
import android.widget.BaseAdapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mode1.base.BaseActivity;
import com.example.mode1.bean.MyBean;
import com.example.mode1.fragment.OneFragment;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private List<MyBean.ResultBean> list = new ArrayList<>();

    public MyAdapter(FragmentManager fm,  List<MyBean.ResultBean> list) {
        super(fm);

        this.list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            OneFragment oneFragment = new OneFragment();
            MyBean.ResultBean resultBean = list.get(i);
            ArrayList<MyBean.ResultBean.SecondCategoryVoBean> secondCategoryVo = (ArrayList<MyBean.ResultBean.SecondCategoryVoBean>) resultBean.getSecondCategoryVo();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ss",secondCategoryVo);
            oneFragment.setArguments(bundle);
            fragments.add(oneFragment);
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
        MyBean.ResultBean resultBean = list.get(position);
        String name = resultBean.getName();
        return name;
    }
}
