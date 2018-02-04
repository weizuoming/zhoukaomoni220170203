package com.example.hello.zhoukaomoni220170203.model;


import com.example.hello.zhoukaomoni220170203.presenter.interF.LoginP_I;
import com.example.hello.zhoukaomoni220170203.util.OkHttp3Util;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/1/8.
 */

public class Login_M {

    private LoginP_I loginP_i;

    public Login_M(LoginP_I loginP_i) {
        this.loginP_i = loginP_i;
    }

    public void getdata(String loginApi, String aname, String apass) {

        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", aname);
        map.put("password", apass);

        //获取数据
        OkHttp3Util.doPost(loginApi, map, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String string = response.body().string();
                    loginP_i.success(string);
                }
            }
        });
    }
}
