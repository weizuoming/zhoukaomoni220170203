package com.example.hello.zhoukaomoni220170203.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hello.zhoukaomoni220170203.R;
import com.example.hello.zhoukaomoni220170203.model.bean.showBean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    List<showBean.DataBean> list;

    public MyAdapter(Context context, List<showBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = View.inflate(context, R.layout.item_layout, null);
            holder = new ViewHolder();
            //找到控件
            holder.handImage = view.findViewById(R.id.headImage);
            holder.name = view.findViewById(R.id.name);
            holder.date = view.findViewById(R.id.date);
            holder.content = view.findViewById(R.id.content);
            holder.bigImage = view.findViewById(R.id.bigImage);


            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
//        if (list.get(i).getImgUrls() != null) {
            Glide.with(context).load(list.get(i).getUser().getIcon()).into(holder.handImage);
        Glide.with(context).load(list.get(i).getImgUrls()).into(holder.bigImage);
//        }
        holder.name.setText(list.get(i).getUser().getNickname());
        holder.content.setText(list.get(i).getContent());
        holder.date.setText(list.get(i).getCreateTime());

        return view;
    }

    private class ViewHolder {
        ImageView handImage;
        TextView name;
        TextView date;
        TextView content;
        ImageView bigImage;
    }
}
