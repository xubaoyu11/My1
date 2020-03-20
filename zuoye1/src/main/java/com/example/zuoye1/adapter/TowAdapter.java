package com.example.zuoye1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zuoye1.R;
import com.example.zuoye1.bean.MyBean;
import com.example.zuoye1.util.NetUtil;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.zuoye1.adapter
 * @ClassName: TowAdapter
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/10 11:55
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 11:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TowAdapter extends BaseAdapter {
    private Context context;
    private List<MyBean.ResultsBean> list;

    public TowAdapter(Context context, List<MyBean.ResultsBean> list) {
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
            view = View.inflate(context, R.layout.zi_list,null);
            holder = new ViewHolder();
            holder.zi_image = view.findViewById(R.id.zi_image);
            holder.zi_text = view.findViewById(R.id.zi_text);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        MyBean.ResultsBean resultsBean = list.get(i);
        List<String> images = resultsBean.getImages();
      //  NetUtil.getInstance().doGet(images,holder.zi_image);
        String createdAt = resultsBean.getCreatedAt();
        String desc = resultsBean.getDesc();
        holder.zi_text.setText(desc);
        return view;
    }
    class ViewHolder{
        ImageView zi_image;
        TextView zi_text;
    }
}
