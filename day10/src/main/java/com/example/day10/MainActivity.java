package com.example.day10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.day10.adapter.MyAdapter;
import com.example.day10.base.BaseActivity;
import com.example.day10.bean.MyBean;
import com.example.day10.util.NetUtil;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;

import java.util.List;

public class MainActivity extends BaseActivity {


    private android.widget.LinearLayout layout;
    private com.stx.xhb.xbanner.XBanner xbanner;
    private android.widget.ListView listview;

    @Override
    protected int initLayouID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        layout = (LinearLayout) findViewById(R.id.layout);
        xbanner = (XBanner) findViewById(R.id.xbanner);
        listview = (ListView) findViewById(R.id.listview);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        NetUtil instance = NetUtil.getInstance();
        String path = "http://blog.zhaoliang5156.cn/baweiapi/news?page=1&pageSize=10";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.ResultBean> result = myBean.getResult();
                MyAdapter myAdapter = new MyAdapter(MainActivity.this,result);
                listview.setAdapter(myAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }

}
