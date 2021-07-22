package com.example.webview.ui

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.example.webview.base.BaseActivity
import com.example.webview.core.extensions.replaceFragmentSafely
import com.example.webview.core.extensions.viewBinding
import com.example.webview.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * The MainActivity.kt, Main activity class, launcher activity
 * @author Malik Dawar, malikdawar@hotmail.com
 */

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun getLayout(): ViewBinding = binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        replaceFragmentSafely(WebViewFragment())
    }
}