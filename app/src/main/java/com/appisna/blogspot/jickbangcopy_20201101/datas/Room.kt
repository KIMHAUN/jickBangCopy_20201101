package com.appisna.blogspot.jickbangcopy_20201101.datas

import java.text.NumberFormat
import java.util.*

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {


//    부가기능(fun) 직접 제작
//    1. price 값에 따라서 가공된 가격(2억 1,000)
    fun getFormattedPrice() : String{

//    1억 이상인가
        if(price >= 10000){
            val uk = price / 10000
            var rest = NumberFormat.getNumberInstance(Locale.KOREA).format(price % 10000)
            if(rest == "0") rest = ""
            return "${uk}억 ${rest}"
        }
        else {
            return NumberFormat.getNumberInstance(Locale.KOREA).format(price % 10000)
        }
    }
//    2. 층수 값에 따라서 몇 층인지 알려주기.(2층, 반지하, 지하 1층)
    fun getFormattedFloor() : String{
        if(floor >= 1){
            return "${address}, ${floor}층"
        }else if(floor == 0){
            return "${address}, 반지하"
        }else{
            return "${address}, 지하 ${-floor}층"
        }
    }
}