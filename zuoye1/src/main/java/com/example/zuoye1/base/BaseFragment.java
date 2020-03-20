package com.example.zuoye1.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @ProjectName: My Application1
 * @Package: com.example.zuoye1.base
 * @ClassName: BaseFragment
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 11:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 11:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseFragment extends Fragment {

    public View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int i = initLayoutId();
        view = View.inflate(getContext(),i,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();

        initListener();
        initData();
    }

    protected abstract int initLayoutId();
    protected abstract void initView();

    protected abstract void initListener();
    protected abstract  void  initData();
}
