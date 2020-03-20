package com.example.mode1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mode1.R;
import com.example.mode1.bean.TowListBean;

import java.util.ArrayList;
import java.util.List;

public class TowListAdapter extends BaseAdapter {
    private Context context;
    private List<TowListBean.ResultBean> list = new ArrayList<>();

    public TowListAdapter(Context context, List<TowListBean.ResultBean> list) {
        this.context = context;
        this.list.addAll(list);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = View.inflate(context,R.layout.tow_zi,null);
        TextView name = view1.findViewById(R.id.towzi_text);
        TowListBean.ResultBean resultBean = list.get(i);
        String commodityName = resultBean.getCommodityName();
        name.setText(commodityName);
        return view1;
    }

}
