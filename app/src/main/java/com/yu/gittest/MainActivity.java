package com.yu.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTestYu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("","首页");

        initView();
    }

    private void initView() {
        btnTestYu = (Button) findViewById(R.id.btnTestYu);
        btnTestYu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TestYuActivity.class));
            }
        });
    }


    private void firtMethod(){
        Log.i("master！！","方法一");
    }

    private void secondMethod(){
        Log.w("test_yu","第二个方法");
    }
}
