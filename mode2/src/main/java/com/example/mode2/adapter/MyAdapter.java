package com.example.mode2.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mode2.R;
import com.example.mode2.bean.MyBean;
import com.example.mode2.fragment.OneFragment;
import com.example.mode2.util.NetUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.mode2.adapter
 * @ClassName: MyAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/8 19:23
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 19:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyAdapter extends FragmentPagerAdapter {
     private ArrayList<Fragment> fragments = new ArrayList<>();
     private List<MyBean.DataBean> list = new ArrayList<>();

    public MyAdapter(@NonNull FragmentManager fm, List<MyBean.DataBean> list) {
        super(fm);
        this.list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            OneFragment oneFragment = new OneFragment();
            fragments.add(oneFragment);
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        MyBean.DataBean dataBean = list.get(position);
        String fromname = dataBean.getFROMNAME();
        return fromname;
    }
}
