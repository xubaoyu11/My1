package com.example.mode1.fragment;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.viewpager.widget.ViewPager;

import com.example.mode1.R;
import com.example.mode1.adapter.OneAdapter;
import com.example.mode1.base.BaseFragment;
import com.example.mode1.bean.MyBean;
import com.example.mode1.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OneFragment extends BaseFragment {

    private LinearLayout oneLayout;
    private TabLayout oneTablayout;
    private ViewPager oneVp;

    @Override
    protected int initLayoutId() {
        return R.layout.one_fragment;
    }

    @Override
    protected void initView() {

        oneLayout = (LinearLayout)view.findViewById(R.id.one_layout);
        oneTablayout = (TabLayout)view.findViewById(R.id.one_tablayout);
        oneVp = (ViewPager)view.findViewById(R.id.one_vp);
    }

    @Override
    protected void initData() {
        ArrayList<MyBean.ResultBean.SecondCategoryVoBean> list = (ArrayList<MyBean.ResultBean.SecondCategoryVoBean>) getArguments().getSerializable("ss");
        OneAdapter oneAdapter = new OneAdapter(getChildFragmentManager(),list);
                oneVp.setAdapter(oneAdapter);
                oneTablayout.setupWithViewPager(oneVp);
    }

    @Override
    protected void initListener() {

    }
}
