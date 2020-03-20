package com.example.zuoye1.fragment;


import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.zuoye1.R;
import com.example.zuoye1.adapter.TowAdapter;
import com.example.zuoye1.base.BaseFragment;
import com.example.zuoye1.bean.MyBean;
import com.example.zuoye1.util.NetUtil;
import com.google.gson.Gson;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TowFragment extends BaseFragment {


    private ListView listview;

    @Override
    protected int initLayoutId() {
        return R.layout.fragment_tow;
    }

    @Override
    protected void initView() {

        listview = (ListView)view.findViewById(R.id.listview);
    }

    @Override
    protected void initListener() {
        NetUtil instance = NetUtil.getInstance();
        String path = "http://gank.io/api/data/Android/10/1";
        instance.doGet(path, new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                MyBean myBean = gson.fromJson(json, MyBean.class);
                List<MyBean.ResultsBean> results = myBean.getResults();
                TowAdapter towAdapter = new TowAdapter(getContext(),results);
                listview.setAdapter(towAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }

    @Override
    protected void initData() {

    }
}
