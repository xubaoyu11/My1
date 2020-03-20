package com.example.mode1.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mode1.R;
import com.example.mode1.adapter.TowListAdapter;
import com.example.mode1.base.BaseFragment;
import com.example.mode1.bean.TowBean;
import com.example.mode1.bean.TowListBean;
import com.example.mode1.util.NetUtil;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;

import java.util.List;

public class TowFragment extends BaseFragment {
    private XBanner xbanner;
    private ListView towListview;
    private static final String TAG = "TowFragment";
    private String id;
    private TowListAdapter towListAdapter;
    @Override
    protected int initLayoutId() {
        return R.layout.tow_fragment;
    }

    @Override
    protected void initView() {

        xbanner = (XBanner) view.findViewById(R.id.xbanner);
        towListview = (ListView)view.findViewById(R.id.tow_listview);
    }

    @Override
    protected void initData() {
        getBeanner();
        getList();
    }

    @Override
    protected void initListener() {

    }
    //进行轮播
    private void getBeanner(){
        NetUtil instance = NetUtil.getInstance();
        instance.doGet("http://172.17.8.100/small/commodity/v1/bannerShow", new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                TowBean towBean = gson.fromJson(json, TowBean.class);
                final List<TowBean.ResultBean> result = towBean.getResult();
                Log.d(TAG, "onCg: "+result);
                xbanner.setData(result,null);
                xbanner.setmAdapter(new XBanner.XBannerAdapter() {
                    @Override
                    public void loadBanner(XBanner banner, View view, int position) {
                        TowBean.ResultBean resultBean = result.get(position);
                        String imageUrl = resultBean.getImageUrl();
                        NetUtil.getInstance().TuPian(imageUrl, (ImageView) view);
                    }
                });
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
    //list展示
    private void getList(){
        Bundle arguments = getArguments();
        //id = arguments.getString("id");
        Log.d(TAG, "getList: "+id);
        NetUtil instance = NetUtil.getInstance();
        instance.doGet("http://172.17.8.100/small/commodity/v1/findCommodityByCategory?categoryId=1001004002&page=1&count=10", new NetUtil.CallBack() {
            @Override
            public void onCg(String json) {
                Gson gson = new Gson();
                TowListBean towListBean = gson.fromJson(json, TowListBean.class);
                List<TowListBean.ResultBean> result = towListBean.getResult();
                if (towListAdapter==null){
                    towListAdapter = new TowListAdapter(getContext(), result);
                }
                towListview.setAdapter(towListAdapter);
            }

            @Override
            public void onSb(String msg) {

            }
        });
    }
}
