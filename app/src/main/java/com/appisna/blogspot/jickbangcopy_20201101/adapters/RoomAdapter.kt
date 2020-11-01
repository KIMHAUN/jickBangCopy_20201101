package com.appisna.blogspot.jickbangcopy_20201101.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.appisna.blogspot.jickbangcopy_20201101.R
import com.appisna.blogspot.jickbangcopy_20201101.datas.Room
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class RoomAdapter(
    val mContext:Context,
    val resId: Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList){


    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!

        val roomData = mList[position]
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloor = row.findViewById<TextView>(R.id.addressAndFloor)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text = roomData.description
        priceTxt.text = roomData.getFormmatedPrice()



        return row
    }


}