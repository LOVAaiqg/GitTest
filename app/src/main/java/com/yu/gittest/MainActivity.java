package com.yu.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("","首页");
    }

    private void firtMethod(){
        Log.w("test_yu","第一个方法");

    }

    private void secondMethod(){
        Log.w("test_yu","第二个方法");
    }
}
