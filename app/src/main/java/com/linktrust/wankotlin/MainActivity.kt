  package com.linktrust.wankotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.util.regex.Matcher
import java.util.regex.Pattern

  class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var filePath = filesDir.absolutePath
        var file = File("$filePath/etc2")
        if(!file.exists()){
            Log.e("haohai","000000000")
            file.mkdirs()
        }else{
            Log.e("haohai","11111")
        }

        var file2 = File("${file.absolutePath}/name2.txt")
        if (file2.exists()){
            Log.e("haohai","222222")
        }else{
            Log.e("haohai","333333")
            file2.createNewFile()
            Log.e("haohai","555555")
        }

        if (file2.exists()){
            Log.e("haohai","666666")
        }else{
            Log.e("haohai","777777")
        }
    }

      /**
       *
       *
       *
       * */
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