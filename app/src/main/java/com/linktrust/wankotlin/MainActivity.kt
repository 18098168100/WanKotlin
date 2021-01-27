  package com.linktrust.wankotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

  class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG,"这是我的第1次提交")
    }
}