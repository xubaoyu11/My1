package com.example.mode5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.mode5.adapter.MainAdapter;
import com.example.mode5.base.BaseActivity;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends BaseActivity {

    private android.widget.ImageView toxiang;
    private TabLayout tebHome;
    private ViewPager vpHome;



    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    protected void initView() {

        toxiang = findViewById(R.id.toxiang);
        tebHome = (TabLayout) findViewById(R.id.tebHome);
        vpHome = (ViewPager) findViewById(R.id.vpHome);
    }


    protected void initLayout() {
        toxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);

                intent.setType("image/*");
                startActivityForResult(intent, 100);
            }
        });
    }


    protected void initData() {
        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager());
        vpHome.setAdapter(mainAdapter);
        tebHome.setupWithViewPager(vpHome);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==100&&resultCode==RESULT_OK){
            Uri uri = data.getData();
            //获取相册图片需要添加sd权限
            Glide.with(this).load(uri).into(toxiang);

        }
    }
}
