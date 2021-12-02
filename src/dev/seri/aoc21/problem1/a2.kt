package dev.seri.aoc21.problem1

import java.io.File


fun main() {
    val file = File("input/1")
    val inputs = file.readLines().map { it.toInt() }

    var lastWindowSum = 0
    val answer = inputs.windowed(3).count { window ->
        (window.sum() > lastWindowSum).also {
            lastWindowSum = window.sum()
        }
    }
    println(answer)
}
