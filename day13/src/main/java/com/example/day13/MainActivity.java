package com.example.day13;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.day13.adapter.MyAdapter;
import com.example.day13.bean.MyBean;
import com.example.day13.util.NetUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private GridView gridview;
    private ViewPager vp;
    private ArrayList<MyBean.ResultBean> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout =  findViewById(R.id.tablayout);
        gridview =  findViewById(R.id.gridview);
        vp = findViewById(R.id.vp);
        NetUtil instance = NetUtil.getInstance();
        String path = "http://blog.zhaoliang5156.cn/baweiapi/news?page=1&pageSize=15";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.ResultBean> result = myBean.getResult();
                list.addAll(result);
                MyAdapter myAdapter = new MyAdapter(MainActivity.this,list);
                gridview.setAdapter(myAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }


}
