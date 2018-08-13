package com.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.statusbar.StatusBarCompat;

public class TransparentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置状态栏为透明
        StatusBarCompat.translucentStatusBar(this, true);

        setContentView(R.layout.transparent_main);

    }
}

