package com.example.zuoye1.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.zuoye1.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.zuoye1.base
 * @ClassName: BaseFragment
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 10:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 10:57
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
        initListener();
        initData();
    }
    protected abstract int initLayoutId();
    protected abstract void initView();
    protected abstract void initListener();
    protected abstract  void  initData();
}
