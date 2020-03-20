package com.example.day12.app;

import android.app.Application;
import android.content.Context;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day12.app
 * @ClassName: App
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/11 9:01
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/11 9:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class App extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        context = this;
        super.onCreate();
    }
}
