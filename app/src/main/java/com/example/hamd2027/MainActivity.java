package com.example.hamd2027;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myWebView = findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);       // تفعيل جافا سكريبت
        webSettings.setDomStorageEnabled(true);         // دعم تخزين DOM لتشغيل الفيديو والصوت
        
        // فتح الروابط داخل التطبيق
        myWebView.setWebViewClient(new WebViewClient());
        // دعم تشغيل الفيديو والصوت
        myWebView.setWebChromeClient(new WebChromeClient());
        
        // تحميل الرابط الابتدائي (يمكن تغييره حسب الحاجة)
        myWebView.loadUrl("https://hamd16.lovestoblog.com/user2027/");
    }
    
    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
