package com.moredian.entrance.commonlib.app;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Icon;

/**
 * description ：
 * author : scy
 * email : 1797484636@qq.com
 * date : 2019/8/29 14:31
 */
public class BaseApplication extends Application {

    protected Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
