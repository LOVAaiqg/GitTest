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
        Log.i("master！！","方法一");

    }

    private void secondMethod(){

    }
}
