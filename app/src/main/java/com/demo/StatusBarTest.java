package com.demo;

import android.app.Activity;
import android.graphics.Color;

import com.statusbar.StatusBarCompat;

/**
 * 状态栏设置方法
 */

public class StatusBarTest {


    public void Test(Activity activity) {
        //设置状态栏背景色
        StatusBarCompat.setStatusBarColor(activity, Color.BLACK, 80);


        //设置状态栏为透明
        StatusBarCompat.translucentStatusBar(activity, true);


    }
}
