package com.example.xubaoyu20200116.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xubaoyu20200116.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.xubaoyu20200116.base
 * @ClassName: BaseActivity
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/16 13:50
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/16 13:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected abstract int initLayoutId();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initListener();
}
