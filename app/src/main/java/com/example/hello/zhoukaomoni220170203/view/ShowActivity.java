package com.example.hello.zhoukaomoni220170203.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.hello.zhoukaomoni220170203.R;
import com.example.hello.zhoukaomoni220170203.model.bean.showBean;
import com.example.hello.zhoukaomoni220170203.presenter.Show_P;
import com.example.hello.zhoukaomoni220170203.util.My_api;
import com.example.hello.zhoukaomoni220170203.util.OkHttp3Util;
import com.example.hello.zhoukaomoni220170203.view.interF.ShowV_I;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ShowActivity extends AppCompatActivity implements ShowV_I, XListView.IXListViewListener {

    private XListView xListView;
    List<showBean.DataBean> list = new ArrayList<>();
    private MyAdapter myAdapter;
    int num = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        //获取数据
        Show_P show_p = new Show_P(this);
        show_p.getdata(My_api.joker_api);
        //找到控件
        xListView = findViewById(R.id.xlistview);
        //设置支持上拉还是下拉
        xListView.setPullRefreshEnable(true);//支持下拉刷新
        xListView.setPullLoadEnable(true);//支持上拉加载更多
        xListView.setXListViewListener(this);//设置xlistView的监听事件
    }

    @Override
    public void success(final String s) {
        //获取到数据
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
//                Toast.makeText(ShowActivity.this, s, Toast.LENGTH_LONG).show();
                //获取到数据进行展示

                Gson gson = new Gson();
                showBean showBean = gson.fromJson(s, showBean.class);

                List<com.example.hello.zhoukaomoni220170203.model.bean.showBean.DataBean> data = showBean.getData();
// 获取到集合之后,添加到大集合
                list.addAll(data);
                //设置适配器...
                setAdapter();
            }
        });
    }

    private void setAdapter() {

        if (myAdapter == null) {

            myAdapter = new MyAdapter(ShowActivity.this, list);
            xListView.setAdapter(myAdapter);
        }
    }

    @Override
    public void onRefresh() {

        num++;
        //上拉刷新  设置page+1再去访问数据接口
        HashMap<String, String> map = new HashMap<>();
        map.put("appVersion", "100");
        map.put("page", String.valueOf(num));
        map.put("source", "android");
        OkHttp3Util.doPost(My_api.joker_api, map, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //获取数据之后
                if (response.isSuccessful()) {
                    String string = response.body().string();
                    //展示
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            setAdapter();
                            xListView.stopRefresh();//停止刷新
                        }
                    });

                }
            }
        });

    }

    @Override
    public void onLoadMore() {
        //下拉加载
        xListView.stopRefresh();//停止刷新
    }
}
