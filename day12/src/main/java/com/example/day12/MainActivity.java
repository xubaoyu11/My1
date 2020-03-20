package com.example.day12;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.day12.base.BaseActivity;
import com.example.day12.fragment.OneFragment;
import com.example.day12.fragment.TwoFragment;
import com.example.day12.util.NetUtil;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private TabLayout tablayout;
    private ViewPager vp;
    private android.widget.ImageView image;
    private List<String> tab = new ArrayList<>();
    List<Fragment> list = new ArrayList<>();
    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {


        tablayout = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp);
        image = (ImageView) findViewById(R.id.image);
    }

    @Override
    protected void initData() {

    }
    //获取数据
    @Override
    protected void initListener() {

        //一，侧滑  获取相册图片并展示
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 100);
            }
        });



        NetUtil.getInstance().TuPian("https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2505845389,3637097424&fm=26&gp=0.jpg",image);
        tab.add("标签一");
        tab.add("标签二");
        tablayout.addTab(tablayout.newTab().setText(tab.get(0)));
        tablayout.addTab(tablayout.newTab().setText(tab.get(1)));
        OneFragment oneFragment = new OneFragment();
        TwoFragment twoFragment = new TwoFragment();
        list.add(oneFragment);
        list.add(twoFragment);
        //创建适配器
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        vp.setAdapter(myAdapter);
        tablayout.setupWithViewPager(vp);


    }
    //重写onActivityResult接收回传数据
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            Uri uri = data.getData();
            Glide.with(this).load(uri).into(image);
        }
    }
    private class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return list.get(i);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tab.get(position);
        }
    }}
