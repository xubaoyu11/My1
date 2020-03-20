package com.example.day13.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.day13.R;
import com.example.day13.bean.MyBean;
import com.example.day13.util.NetUtil;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day13.adapter
 * @ClassName: MyAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/12 8:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/12 8:57
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            view = View.inflate(context, R.layout.zi_gridview,null);
            holder = new ViewHolder();
            holder.zi_image = view.findViewById(R.id.zi_image);
            holder.zi_text = view.findViewById(R.id.zi_text);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        MyBean.ResultBean resultBean = list.get(i);
        String imgsrc = resultBean.getImgsrc();
        NetUtil.getInstance().TuPian(imgsrc,holder.zi_image);
        String title = resultBean.getTitle();
        holder.zi_text.setText(title);
        return view;
    }
    class ViewHolder{
        ImageView zi_image;
        TextView zi_text;
    }
}
