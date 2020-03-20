package com.example.zuoye1.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.zuoye1.bean.MyBean;
import com.example.zuoye1.fragment.OneFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.zuoye1.adapter
 * @ClassName: MyAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 11:17
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 11:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private List<MyBean.ResultsBean> list = new ArrayList<>();

    public MyAdapter(@NonNull FragmentManager fm,  List<MyBean.ResultsBean> list) {
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
        MyBean.ResultsBean resultsBean = list.get(position);
        String who = resultsBean.getWho();
        return who;
    }
}
