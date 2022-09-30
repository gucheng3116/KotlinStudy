package com.gucheng

fun main() {

    showOnBoard("卫生纸") { goodsName:String, hour:Int ->
        "双十一，${goodsName}促销倒计时${hour}小时"
    }
}

private fun add(a: Int, b: Int): String {
    return "a b  is $a $b"
}

fun showOnBoard(goodsName: String, showDiscount: (String, Int) -> String) {
    val hour = (2..5).shuffled().last();
    println(showDiscount(goodsName, hour));
}