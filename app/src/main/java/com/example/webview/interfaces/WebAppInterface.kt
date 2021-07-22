package com.example.webview.interfaces

import android.webkit.JavascriptInterface
import com.example.webview.core.extensions.showToastMsg

class WebAppInterface {

    @JavascriptInterface
    fun showMessage(toast: String) {
        showToastMsg(toast)
    }

    @JavascriptInterface
    fun getRandomString(): String {
        return "Hello webpage this message is from Android Native app"
    }
}