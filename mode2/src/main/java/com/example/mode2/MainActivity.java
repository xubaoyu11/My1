package com.example.mode2;

import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.example.mode2.adapter.MyAdapter;
import com.example.mode2.base.BaseActivity;
import com.example.mode2.bean.MyBean;
import com.example.mode2.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {


    private ArrayList<MyBean.DataBean> list = new ArrayList<>();
    private ViewPager vp;
    private android.widget.LinearLayout layout;
    private TabLayout tablayout;

    @Override
    protected int initLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        vp = (ViewPager) findViewById(R.id.vp);
        layout = (LinearLayout) findViewById(R.id.layout);

        tablayout = (TabLayout) findViewById(R.id.tablayout);
    }
    @Override
    protected void initData() {

    }
    @Override
    protected void initListener() {
        NetUtil instance = NetUtil.getInstance();
        String path = "http://www.93.gov.cn/93app/data.do?channelId=1&startNum=10";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.DataBean> data = myBean.getData();
                list.addAll(data);
                tablayout.setupWithViewPager(vp);
                MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),list);
                vp.setAdapter(myAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }


}
