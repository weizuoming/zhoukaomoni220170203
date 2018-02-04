package com.example.hello.zhoukaomoni220170203.presenter;


import com.example.hello.zhoukaomoni220170203.model.Show_M;
import com.example.hello.zhoukaomoni220170203.presenter.interF.ShowP_I;
import com.example.hello.zhoukaomoni220170203.view.interF.ShowV_I;

/**
 * Created by Administrator on 2018/1/8.
 */

public class Show_P implements ShowP_I {

    private Show_M show_m;
    private ShowV_I showV_i;

    public Show_P(ShowV_I showV_i) {
        show_m = new Show_M(this);

        this.showV_i = showV_i;
    }

    public void getdata(String joker_api) {
        show_m.getdata(joker_api);
    }

    @Override
    public void success(String s) {
        showV_i.success(s);
    }
}
