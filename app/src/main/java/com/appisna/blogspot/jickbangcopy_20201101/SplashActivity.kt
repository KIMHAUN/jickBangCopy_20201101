package com.appisna.blogspot.jickbangcopy_20201101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {

    //onCreate: 액티비티가 메모리에 등록될 때(인스턴스화) 안드로이드 os가 실행함.
    //(액티비티의 시작점으로 동작하는 함수)
    //onCreate 내부 내용은 최소 1번은 반드시 실행된다고 보장됨.
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
        //핸들러 자동완성시 android에서 주는 걸로 자동완성.
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({
            //myHander 에게 이 중괄호 내부의 일을 해달라고 요청(할일 등록post)
            //실제로 시간이 지나고 실행될 내용.
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)
            finish() //로딩화면 끄기
        }, 2500)

    }

}