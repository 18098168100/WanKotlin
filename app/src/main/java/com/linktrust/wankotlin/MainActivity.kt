  package com.linktrust.wankotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Matcher
import java.util.regex.Pattern

  class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG,"这是我的第1次提交")
        var result = replaceBlank("aaaa    bbbbb")

        Log.e(TAG,result)

    }


      private fun replaceBlank(str: String?): String? {
          var result: String? = null
          return if (str == null) {
              result
          } else {
              val p: Pattern = Pattern.compile("\\s*|\t|\r|\n")
              val m: Matcher = p.matcher(str)
              result = m.replaceAll("")
              result
          }
      }

      private fun replaceBlank2(str: String): String {
          val p: Pattern = Pattern.compile("\\s*|\t|\r|\n")
          val m: Matcher = p.matcher(str)
          return m.replaceAll("")
      }

      /**
       * 字符转匹配
       *
       * */
      private fun countStr(fullText: String, clickText: String): Int {
          var num = 0
          val pattern: Pattern = Pattern.compile(clickText)
          val findMatcher: Matcher = pattern.matcher(fullText)
          while (findMatcher.find()){
              num = findMatcher.start()
          }
          return num
      }
}