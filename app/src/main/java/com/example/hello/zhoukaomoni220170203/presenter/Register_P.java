package com.example.hello.zhoukaomoni220170203.presenter;


import com.example.hello.zhoukaomoni220170203.model.Register_M;
import com.example.hello.zhoukaomoni220170203.presenter.interF.RegisterP_I;
import com.example.hello.zhoukaomoni220170203.view.interF.RegisterV_I;

/**
 * Created by Administrator on 2018/1/8.
 */

public class Register_P implements RegisterP_I {

    private RegisterV_I registerV_i;
    private Register_M register_m;

    public Register_P(RegisterV_I registerV_i) {
        register_m = new Register_M(this);
        this.registerV_i = registerV_i;
    }

    public void getdata(String register_api, String aname, String apass) {
        register_m.getdata(register_api, aname, apass);
    }

    @Override
    public void success(String s) {
        registerV_i.success(s);
    }
}
