package com.example.mode5.util;

import android.app.Application;
import android.content.Context;

/**
 * @ProjectName: My Application1
 * @Package: com.example.mode5.util
 * @ClassName: App
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/2/18 13:29
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/2/18 13:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class App extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
