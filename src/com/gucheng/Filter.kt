package com.gucheng

val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

val positives = numbers.filter { x -> x > 0 }  // 2

val negatives = numbers.filter { it < 0 }

fun main() {
    print("positive is ")
    positives.forEach { x ->
        print("$x,")
    }
    println("")
    print("negatives is ")
    negatives.forEach { x ->
        print("$x,")
    }
}