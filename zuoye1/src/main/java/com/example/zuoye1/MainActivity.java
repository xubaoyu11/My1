package com.example.zuoye1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.zuoye1.adapter.MyAdapter;
import com.example.zuoye1.base.BaseActivity;
import com.example.zuoye1.bean.MyBean;
import com.example.zuoye1.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.List;


public class MainActivity extends BaseActivity {


    private com.google.android.material.tabs.TabLayout tablayout;
    private androidx.viewpager.widget.ViewPager vp;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp);
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
                MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),results);
                vp.setAdapter(myAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
