package com.example.xubaoyu20200116.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.xubaoyu20200116.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.xubaoyu20200116.base
 * @ClassName: BaseFragment
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/16 14:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/16 14:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int i = initLayoutId();
        view = inflater.inflate(i, container, false);
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        initView();
        initData();
        initListener();
    }

    protected abstract int initLayoutId();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initListener();
}
