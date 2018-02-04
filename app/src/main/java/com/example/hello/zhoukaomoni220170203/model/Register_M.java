package com.example.hello.zhoukaomoni220170203.model;


import com.example.hello.zhoukaomoni220170203.presenter.interF.RegisterP_I;
import com.example.hello.zhoukaomoni220170203.util.OkHttp3Util;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/1/8.
 */

public class Register_M {

    private RegisterP_I registerP_i;

    public Register_M(RegisterP_I registerP_i) {
        this.registerP_i = registerP_i;
    }

    public void getdata(String register_api, String aname, String apass) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", aname);
        map.put("password", apass);

        OkHttp3Util.doPost(register_api, map, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String string = response.body().string();
                    registerP_i.success(string);
                }
            }
        });

    }
}
