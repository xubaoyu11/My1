package com.example.xubaoyu20200210.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xubaoyu20200210.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.xubaoyu20200210.base
 * @ClassName: BaseActivity
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/2/10 15:39
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/2/10 15:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = initLayoutID();
        setContentView(i);
        //初始化控件
        initLayoutView();
        //初始化数据
        initLayoutData();
    }
    //返回布局ID
    protected abstract int initLayoutID();
    //初始化控件
    protected abstract void initLayoutView();
    //初始化数据
    protected abstract void initLayoutData();
}
