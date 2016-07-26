package com.yu.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestYuActivity extends AppCompatActivity implements Adder{
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_yu);

        initView();
    }

    private void initView() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(5,5);
            }
        });
    }


    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
