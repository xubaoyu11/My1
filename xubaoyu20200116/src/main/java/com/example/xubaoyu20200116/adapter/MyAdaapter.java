package com.example.xubaoyu20200116.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.xubaoyu20200116.adapter
 * @ClassName: MyAdaapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/16 14:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/16 14:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyAdaapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private List<>
    public MyAdaapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
