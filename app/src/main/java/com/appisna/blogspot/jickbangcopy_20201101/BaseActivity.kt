package com.appisna.blogspot.jickbangcopy_20201101

import androidx.appcompat.app.AppCompatActivity

//화면출현하지 않음. 객체화 금지(=추상화 abstract).
//단순히 상속을 물려주기 위해 존재. => 추상 클래스로 만들자.
abstract class BaseActivity : AppCompatActivity(){

    val mContext = this
    //this 대신 mContext사용.

    //overiding 무조건 구현해서 사용해야됨.
    abstract fun setupEvents()
    abstract fun setValues()

}