package com.demo;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.statusbar.StatusBarCompat;

public class ColorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置状态栏背景色
        StatusBarCompat.setStatusBarColor(this, Color.RED, 80);
        //or
        //StatusBarCompat.setStatusBarColor(this, Color.parseColor("#FF0000"));

        setContentView(R.layout.color_main);

        ((TextView) findViewById(R.id.sub_text)).setText("this color activity");
    }
}
