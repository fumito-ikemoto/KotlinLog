package jp.techacademy.fumito.ikemoto

import android.util.Log

class Human : Animal, Thinkable {

    private var hobby : String

    constructor(name: String, age : Int, hobby : String) : super(name, age)
    {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotolintest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」")
    }

    override fun think() {
        Log.d("kotolintest", "「私は" + this.hobby + "について考える。」")
    }
}