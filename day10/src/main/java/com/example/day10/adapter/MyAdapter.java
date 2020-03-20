package com.example.day10.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.day10.R;
import com.example.day10.bean.MyBean;
import com.example.day10.util.NetUtil;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day10.adapter
 * @ClassName: MyAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/9 9:09
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 9:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<MyBean.ResultBean> list;

    public MyAdapter(Context context, List<MyBean.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        MyBean.ResultBean resultBean = list.get(position);
        int type = resultBean.getType();
        if (type==1){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHandler handler = null;
        int type = getItemViewType(i);
        if (view==null){
            switch (type){
                case 0:
                    view = View.inflate(context, R.layout.zi_list1,null);
                    handler = new ViewHandler();
                    handler.zi_image = view.findViewById(R.id.zi_image1);
                    handler.zi_text = view.findViewById(R.id.zi_text1);
                    view.setTag(handler);
                    break;
                case 1:
                    view = View.inflate(context, R.layout.zi_list2,null);
                    handler = new ViewHandler();
                    handler.zi_image = view.findViewById(R.id.zi_image2);
                    handler.zi_text = view.findViewById(R.id.zi_text2);
                    view.setTag(handler);
                    break;
            }
        }else {
            handler = (ViewHandler) view.getTag();
        }
        MyBean.ResultBean resultBean = list.get(i);
        String imgsrc = resultBean.getImgsrc();
        NetUtil.getInstance().TuPian(imgsrc,handler.zi_image);
        String digest = resultBean.getDigest();
        handler.zi_text.setText(digest);
        return view;
    }
    class ViewHandler{
        ImageView zi_image;
        TextView zi_text;
    }
}
