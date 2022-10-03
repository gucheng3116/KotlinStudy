package com.gucheng

val systemUsers:MutableList<Int> = mutableListOf(1,2,3)

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun main() {
    addSystemUser(4)
    systemUsers.forEach {
        i->println("Some useful info on user $i")
    }
    systemUsers.removeAt(1)
    println("after remove")
    systemUsers.forEach {
            i->println("Some useful info on user $i")
    }
}