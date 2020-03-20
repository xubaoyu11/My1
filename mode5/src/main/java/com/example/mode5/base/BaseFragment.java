package com.example.mode5.base;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {
    public View rootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layout = initLayoutId();
        rootView = View.inflate(getContext(),layout,null);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
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
