package com.example.hello.zhoukaomoni220170203.model;


import com.example.hello.zhoukaomoni220170203.presenter.interF.ShowP_I;
import com.example.hello.zhoukaomoni220170203.util.OkHttp3Util;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/1/8.
 */

public class Show_M {

    private ShowP_I showP_i;

    public Show_M(ShowP_I showP_i) {
        this.showP_i = showP_i;
    }

    public void getdata(String joker_api) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appVersion", "100");
        map.put("page", "1");
        map.put("source", "android");

        OkHttp3Util.doPost(joker_api, map, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String string = response.body().string();
                    showP_i.success(string);
                }
            }
        });
    }
}
