package com.example.mode2.fragment;


import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mode2.MainActivity;
import com.example.mode2.R;
import com.example.mode2.adapter.OneAdapter;
import com.example.mode2.base.BaseFragment;
import com.example.mode2.bean.OneBean;
import com.example.mode2.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends BaseFragment {
    private static final String TAG = "MainActivity";

    private LinearLayout layout;
    private TabLayout tablayout;
    private ViewPager vp;

    @Override
    protected int initLayoutId() {
        return R.layout.fragment_one;
    }

    @Override
    protected void initView() {

        layout = (LinearLayout)view.findViewById(R.id.layout);
        tablayout = (TabLayout)view.findViewById(R.id.tablayout);
        vp = (ViewPager)view.findViewById(R.id.vp);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        NetUtil instance = NetUtil.getInstance();
        String path = "http://172.17.8.100/small/commodity/v1/findCategory";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Log.d(TAG, "onCg: "+json);
                Gson gson = new Gson();
                OneBean oneBean = gson.fromJson(json, OneBean.class);
                List<OneBean.ResultBean> result = oneBean.getResult();
                tablayout.setupWithViewPager(vp);
                OneAdapter oneAdapter = new OneAdapter(getChildFragmentManager(), result);
                vp.setAdapter(oneAdapter);

            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
