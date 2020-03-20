package com.example.day9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.BaseAdapter;

import com.example.day9.adapter.MyAdapter;
import com.example.day9.base.BaseActivity;
import com.example.day9.bean.MyBean;
import com.example.day9.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.qy.xlistview.XListView;


import java.util.List;


public class MainActivity extends BaseActivity {


    private com.google.android.material.tabs.TabLayout tablayout;
    private com.qy.xlistview.XListView xlistview;


    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        tablayout = (TabLayout) findViewById(R.id.tablayout);

        xlistview = (XListView) findViewById(R.id.xlistview);
    }

    @Override
    protected void initListData() {

    }

    @Override
    protected void initListener() {
        String path="http://blog.zhaoliang5156.cn/baweiapi/news?page=1&pageSize=20";
        NetUtil.getInstance().doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.ResultBean> result = myBean.getResult();
                MyAdapter myAdapter = new MyAdapter(MainActivity.this,result);
                xlistview.setAdapter(myAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
