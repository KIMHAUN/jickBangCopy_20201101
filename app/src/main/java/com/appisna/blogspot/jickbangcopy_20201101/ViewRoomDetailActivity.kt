package com.appisna.blogspot.jickbangcopy_20201101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appisna.blogspot.jickbangcopy_20201101.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


    }

    override fun setValues() {
        //캐스팅 (변신 주문) 기본 자료형간의 변환을 as로하면 앱이 죽음.
        //val str1 = "2020" 을 Int로 할 때 as Int 불가능. toInt().
        val room = intent.getSerializableExtra("roomData") as Room
        descriptionTxt.text = room.description
        priceTxt.text = room.getFormattedPrice()
        floorTxt.text = room.getFormattedFloor()
        addressTxt.text = room.address

    }
}