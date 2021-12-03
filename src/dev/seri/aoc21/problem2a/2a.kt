package dev.seri.aoc21.problem2a

import java.io.File

fun main() {
    val file = File("res/2")
    val startingPosition = Position(0,0, 0)

    val finalPosition = file.readLines()
            .mapNotNull { it.toInstruction() }
            .fold(startingPosition) { position, instruction ->
                position.move(instruction)
            }

    println(finalPosition)
    println(finalPosition.horizontalPosition * finalPosition.depth)
}