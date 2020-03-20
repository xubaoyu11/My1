package com.example.xubaoyu20200208;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取资源id
        webview = findViewById(R.id.webview);
        //获取WebSettings辅助类
        WebSettings settings = webview.getSettings();
        //设置允许支持js交互
        settings.setAppCacheEnabled(true);
        //加载网页
        webview.loadUrl("https://tieba.baidu.com/index.html");
        //WebViewClient辅助类辅助WebView处理各种通知与请求事件
         webview.setWebViewClient(new WebViewClient(){
             //页面的开始
             @Override
             public void onPageStarted(WebView view, String url, Bitmap favicon) {
                 super.onPageStarted(view, url, favicon);
                 Log.i("xxx", "onPageStarted: 页面开始");
             }
             //页面结束

             @Override
             public void onPageFinished(WebView view, String url) {
                 super.onPageFinished(view, url);
                 Log.i("xxx", "onPageFinished: 页面结束");
             }
             //控制对新加载的Url的处理,
             // 返回true,说明主程序处理WebView不做处理,
             // 返回false意味着WebView会对其进行处理

             @Override
             public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                 Log.i("xxx", "webview会对其进行处理");
                 return true;
             }
         });
        //WebChromeClient：辅助WebView处理Javascript的对话框、网站图标、网站title、加载进度等
        webview.setWebChromeClient(new WebChromeClient(){
            //进度改变了

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                Log.i("xxx", "onProgressChanged: 进度改变了");
            }
            //判断是否让页面弹出对话框

            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return false;
            }

            @Override
            public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) {
                super.onReceivedTouchIconUrl(view, url, precomposed);
                Log.i("xxx", view.getTitle());
            }
        });
    }
}
