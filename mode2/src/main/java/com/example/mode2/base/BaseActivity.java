package com.example.mode2.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mode2.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.mode2.base
 * @ClassName: BaseActivity
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/7 15:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 15:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = initLayoutID();
        setContentView(i);
        initView();
        initData();
        initListener();

    }
    //获取试图
    protected abstract int initLayoutID();
    //找控件
    protected abstract void initView();
    //获取数据
    protected abstract void initData();
    protected abstract void initListener();

}
