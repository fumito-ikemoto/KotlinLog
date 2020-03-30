package jp.techacademy.fumito.ikemoto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var taro = Human("太郎", 20, "世界")
        taro.say()
        taro.think()

        var jiro = Human("次郎", 17, "宇宙")
        jiro.say()
        jiro.think()
    }
}
