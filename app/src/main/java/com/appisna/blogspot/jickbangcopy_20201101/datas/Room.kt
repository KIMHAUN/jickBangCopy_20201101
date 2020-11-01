package com.appisna.blogspot.jickbangcopy_20201101.datas

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {


//    부가기능(fun) 직접 제작
//    1. price 값에 따라서 가공된 가격(2억 1,000)
    fun getFormmatedPrice() : String{

//    1억 이상인가
        if(price >= 10000){
            val uk = price / 10000
            val rest = price % 10000

            return "${uk}억 ${rest}"
        }
        else {
            return "1억 안됨."
        }
    }
//    2. 층수 값에 따라서 몇 층인지 알려주기.(2층, 반지하, 지하 1층)




}