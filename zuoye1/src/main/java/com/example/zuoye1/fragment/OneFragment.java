package com.example.zuoye1.fragment;


import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.zuoye1.R;
import com.example.zuoye1.adapter.MyAdapter;
import com.example.zuoye1.adapter.OneAdapter;
import com.example.zuoye1.base.BaseFragment;
import com.example.zuoye1.bean.MyBean;
import com.example.zuoye1.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends BaseFragment {


    private TabLayout tablayout;
    private ViewPager vp;

    @Override
    protected int initLayoutId() {
        return R.layout.fragment_one;
    }

    @Override
    protected void initView() {

        tablayout = (TabLayout)view.findViewById(R.id.tablayout);
        vp = (ViewPager)view.findViewById(R.id.vp);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        NetUtil instance = NetUtil.getInstance();
        instance.doGet("http://gank.io/api/data/Android/10/1", new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.ResultsBean> results = myBean.getResults();
                tablayout.setupWithViewPager(vp);
                OneAdapter oneAdapter = new OneAdapter(getChildFragmentManager(),results);
                vp.setAdapter(oneAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
