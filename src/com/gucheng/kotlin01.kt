package com.gucheng

import java.text.SimpleDateFormat

fun main() {
    val name = "liuwei"
    val xing = name.substring(0 until 3)

    println("xing is " + xing)
    println("daysize is " + getDaySize())
    methodMap.get(1)!!.invoke()
}

val abc = fun() {
    println("abcd")
}

val methodMap = mapOf(1 to abc)

fun getDaySize() : Long {
    val MILLIS_OF_DAY = 1000 * 60 * 60 * 24
    var earlistTimestamp = dateToTimestamp("2021-07-09 18:00:00")
    var now = System.currentTimeMillis()
    return (now - earlistTimestamp) / MILLIS_OF_DAY + 1
}

fun dateToTimestamp(date: String?):Long {
    val TIME_FORMAT = "yyyy-MM-dd HH:mm:ss"
    var format = SimpleDateFormat(TIME_FORMAT)
    var date2 = format.parse(date)
    return date2.time
}
