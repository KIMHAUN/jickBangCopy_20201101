package com.appisna.blogspot.jickbangcopy_20201101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


    }

    override fun setValues() {
        //로딩이 끝나면(2.5초 정도 후에) 메인 화면으로 이동 => 로딩화면 종료.

        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({
            //myHander 에게 이 중괄호 내부의 일을 해달라고 요청(할일 등록post)
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)
            finish() //로딩화면 끄기
        }, 2500)

    }

}