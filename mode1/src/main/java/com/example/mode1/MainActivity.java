package com.example.mode1;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.mode1.adapter.MyAdapter;
import com.example.mode1.base.BaseActivity;
import com.example.mode1.bean.MyBean;
import com.example.mode1.fragment.OneFragment;
import com.example.mode1.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private LinearLayout layout;
    private TabLayout tablayout;
    private ViewPager vp;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    private static final String TAG = "MainActivity";
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
        String path="http://172.17.8.100/small/commodity/v1/findCategory";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Log.d(TAG, "onCg: "+json);
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.ResultBean> result = myBean.getResult();
                MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),result);
                vp.setAdapter(myAdapter);
                tablayout.setupWithViewPager(vp);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
