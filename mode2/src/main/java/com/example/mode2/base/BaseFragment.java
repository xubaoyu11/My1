package com.example.mode2.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mode2.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.mode2.fragment
 * @ClassName: BaseFragment
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 10:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 10:08
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
    protected abstract void initData();
    protected abstract void initListener();
}
