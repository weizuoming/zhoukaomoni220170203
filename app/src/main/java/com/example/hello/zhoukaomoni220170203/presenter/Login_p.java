package com.example.hello.zhoukaomoni220170203.presenter;


import com.example.hello.zhoukaomoni220170203.model.Login_M;
import com.example.hello.zhoukaomoni220170203.presenter.interF.LoginP_I;
import com.example.hello.zhoukaomoni220170203.view.interF.LoginV_I;

/**
 * Created by Administrator on 2018/1/8.
 */

public class Login_p implements LoginP_I {

    private LoginV_I loginV_i;
    private Login_M login_m;

    public Login_p(LoginV_I loginV_i) {
        this.loginV_i = loginV_i;
        login_m = new Login_M(this);
    }

    public void getdata(String loginApi, String aname, String apass) {
        login_m.getdata(loginApi, aname, apass);
    }

    @Override
    public void success(String s) {
        loginV_i.success(s);
    }
}
