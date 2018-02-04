package com.example.hello.zhoukaomoni220170203;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hello.zhoukaomoni220170203.presenter.Login_p;
import com.example.hello.zhoukaomoni220170203.util.My_api;
import com.example.hello.zhoukaomoni220170203.view.RegisterActivity;
import com.example.hello.zhoukaomoni220170203.view.ShowActivity;
import com.example.hello.zhoukaomoni220170203.view.interF.LoginV_I;

public class MainActivity extends AppCompatActivity implements LoginV_I {

    private EditText name;
    private EditText pas;
    private Login_p login_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //获取控件
        name = findViewById(R.id.name);
        pas = findViewById(R.id.pas);
    }

    //点击登录
    public void login(View view) {
        String aname = name.getText().toString();
        String apass = pas.getText().toString();

        //MVP获取数据
        login_p = new Login_p(this);
        login_p.getdata(My_api.login_api, aname, apass);

    }

    //注册
    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);

    }

    @Override
    public void success(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                startActivity(intent);

            }
        });
    }
}
