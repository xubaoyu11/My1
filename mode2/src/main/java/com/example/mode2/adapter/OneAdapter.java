package com.example.mode2.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mode2.bean.MyBean;
import com.example.mode2.bean.OneBean;
import com.example.mode2.fragment.OneFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.mode2.adapter
 * @ClassName: OneAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 10:19
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 10:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class OneAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private List<OneBean.ResultBean> list = new ArrayList<>();

    public OneAdapter(@NonNull FragmentManager fm, List<OneBean.ResultBean> list) {
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
        OneBean.ResultBean resultBean = list.get(position);
        String name = resultBean.getName();
        return name;

    }
}
