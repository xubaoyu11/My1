package com.example.xubaoyu20200210.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.xubaoyu20200210.R;

/**
 * @ProjectName: My Application1
 * @Package: com.example.xubaoyu20200210.base
 * @ClassName: BaseFragmrnt
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/2/10 15:51
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/2/10 15:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseFragmrnt extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(),initLayoutID(),null);
        initLayoutView();
        initLayoutID();
        return view;

    }

    //返回布局ID
    protected abstract int initLayoutID();
    //初始化控件
    protected abstract void initLayoutView();
    //初始化数据
    protected abstract void initLayoutData();
}
