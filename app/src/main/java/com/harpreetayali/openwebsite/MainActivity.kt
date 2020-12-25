package com.harpreetayali.openwebsite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        webView.settings.javaScriptEnabled = true

//        webView.webViewClient = object : WebViewClient(){
//            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
//                view?.loadUrl(request?.url.toString())
//                return true
//            }
//        }
        webView.loadUrl("http://202.164.41.3/bcm")
    }
}