package com.gucheng

const val POINT_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int,Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 200)

fun main() {
    EZPassAccounts.forEach {
        k,v-> println ("ID is $k: credit $v")
    }
}