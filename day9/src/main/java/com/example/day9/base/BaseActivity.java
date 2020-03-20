package com.example.day9.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day9.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day9.base
 * @ClassName: BaseActivity
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/8 9:04
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 9:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = initLayoutId();
        setContentView(i);
        initView();
        initListData();
        initListener();
    }
    //获取资源id
    protected abstract int initLayoutId();
    //
    protected abstract void initView();
    //
    protected abstract void initListData();
    //
    protected abstract void initListener();
}
