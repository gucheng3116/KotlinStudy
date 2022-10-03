package com.gucheng

const val POINT_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int,Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 200)

fun main() {
    accountsReport()
    updatingPointsCredit(1)
    updatingPointsCredit(1)
    updatingPointsCredit(5)
    accountsReport()
}

fun updatingPointsCredit(id: Int) {
    if (EZPassAccounts.containsKey(id)) {
        println("Updating $id...")
        EZPassAccounts[id] = EZPassAccounts.getValue(id) + POINT_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $id)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassAccounts.forEach {
        k,v -> println("id $k: credit $v")
    }
}