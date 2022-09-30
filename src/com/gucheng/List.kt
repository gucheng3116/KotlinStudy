package com.gucheng

val systemUsers:MutableList<Int> = mutableListOf(1,2,3)

fun main() {
    println("hello world")
    systemUsers.forEach {
        i->println("Some useful info on user $i")
    }
}