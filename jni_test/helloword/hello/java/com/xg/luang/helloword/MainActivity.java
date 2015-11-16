package com.xg.luang.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnLog;
    private HelloJni helloJni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLog = (Button) findViewById(R.id.btnLog);
        btnLog.setOnClickListener(this);

 //        jni  接口
        helloJni = new HelloJni();
//  加载本地代码
        System.loadLibrary("hello_jni");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLog :
               // Toast.makeText(MainActivity.this, "helloLog", Toast.LENGTH_SHORT).show();
                helloJni.helloJniLog();
                break;
            default:
                    break;
        }
    }
}
