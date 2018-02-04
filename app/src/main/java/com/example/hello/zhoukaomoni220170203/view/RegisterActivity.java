package com.example.hello.zhoukaomoni220170203.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hello.zhoukaomoni220170203.MainActivity;
import com.example.hello.zhoukaomoni220170203.R;
import com.example.hello.zhoukaomoni220170203.presenter.Register_P;
import com.example.hello.zhoukaomoni220170203.util.My_api;
import com.example.hello.zhoukaomoni220170203.view.interF.RegisterV_I;

public class RegisterActivity extends AppCompatActivity implements RegisterV_I {

    private EditText name;
    private EditText pass;
    private Register_P register_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //获取控件
        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);

        register_p = new Register_P(this);
    }

    //点击按钮
    public void playNow(View view) {

        String aname = name.getText().toString();
        String apass = pass.getText().toString();

        register_p.getdata(My_api.register_api, aname, apass);
    }

    @Override
    public void success(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
