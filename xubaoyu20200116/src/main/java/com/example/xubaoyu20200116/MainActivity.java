package com.example.xubaoyu20200116;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.xubaoyu20200116.adapter.MyAdaapter;
import com.example.xubaoyu20200116.base.BaseActivity;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends BaseActivity {


    private com.google.android.material.tabs.TabLayout tablayout;
    private android.widget.ImageView imageview;
    private androidx.viewpager.widget.ViewPager vp;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        imageview = (ImageView) findViewById(R.id.imageview);
        vp = (ViewPager) findViewById(R.id.vp);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        //一，侧滑  获取相册图片并展示
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 100);
            }

        });
        //调用适配器
        MyAdaapter myAdaapter = new MyAdaapter(getSupportFragmentManager());
        vp.setAdapter(myAdaapter);
        //关联
        tablayout.setupWithViewPager(vp);
    }
    //重写接收回传的数据
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==100){
            Uri data1 = data.getData();
            Glide.with(this).load(data1).into(imageview);
        }

    }
}
