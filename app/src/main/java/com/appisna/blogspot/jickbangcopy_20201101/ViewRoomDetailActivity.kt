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
        val room = intent.getSerializableExtra("roomData") as Room
        descriptionTxt.text = room.description
        priceTxt.text = room.getFormattedPrice()
        floorTxt.text = room.getFormattedFloor()
        addressTxt.text = room.address

    }
}