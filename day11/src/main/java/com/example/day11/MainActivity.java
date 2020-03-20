package com.example.day11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.day11.adapter.MyAdapter;
import com.example.day11.base.BaseActivity;
import com.example.day11.bean.MyBean;
import com.example.day11.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.List;


public class MainActivity extends BaseActivity {


    private android.widget.LinearLayout layout;
    private com.google.android.material.tabs.TabLayout tablayout;
    private androidx.viewpager.widget.ViewPager vp;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        layout = (LinearLayout) findViewById(R.id.layout);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        NetUtil instance = NetUtil.getInstance();
        String path = "http://47.94.132.125/baweiapi/ElevenTwo";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                String title = myBean.getTitle();
                tablayout.setupWithViewPager(vp);
                MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
                vp.setAdapter(myAdapter);

            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
