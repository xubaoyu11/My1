package com.example.zuoye1.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.zuoye1.bean.MyBean;
import com.example.zuoye1.fragment.TowFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.zuoye1.adapter
 * @ClassName: OneAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 11:44
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 11:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class OneAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private List<MyBean.ResultsBean> list = new ArrayList<>();

    public OneAdapter(@NonNull FragmentManager fm,  List<MyBean.ResultsBean> list) {
        super(fm);
        this.list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            TowFragment towFragment = new TowFragment();
            fragments.add(towFragment);
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
        String desc = resultsBean.getDesc();
        return desc;
    }
}
