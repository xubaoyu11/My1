package com.example.mode5.base;

import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layout = initLayoutId();
        setContentView(layout);
        initView();
        initLayout();
        initData();
    }
    //获取id
    protected abstract int initLayoutId();
    //初始化对象
    protected abstract void initView();
    //监听控件
    protected abstract void initLayout();
    //内容
    protected abstract void initData();
}
