package com.gucheng

val openIssues: MutableSet<String> = mutableSetOf("uniqueDes1", "uniqueDes2", "uniqueDes3")

fun addIssue(uniqueDesc:String) : Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatus(isAdded:Boolean) {
    return if(isAdded) print("registry success") else print("duplicated and reject")
}

fun main() {
    val aNewIssue = "uniqueDes4"
    val anExistIssue = "uniqueDes2"
    println("Issue $aNewIssue ${getStatus(addIssue(aNewIssue))}")
    println("Issue $anExistIssue ${getStatus(addIssue(anExistIssue))}")
    for (openIssue in openIssues) {
        print("$openIssue, ")
    }
    openIssues.add("uniqueDes1")
    println("")
    for (openIssue in openIssues) {
        print("$openIssue, ")
    }
    println("")
    openIssues.add("uniqueDes5")
    for (openIssue in openIssues) {
        print("$openIssue, ")
    }


}