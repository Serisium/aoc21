package dev.seri.aoc21.problem1

import java.io.File

fun main() {
    val file = File("input/1")
    val inputs = file.readLines().map { it.toInt() }

    val answer = inputs.windowed(2).count {
        it[1] > it[0]
    }
    println(answer)
}
