package dev.seri.aoc21.problem2a

class Instruction(
        val direction: Direction,
        val amount: Int
) {
    override fun toString(): String {
        return "Direction: $direction\t\tAmount: $amount"
    }
}

fun String.toInstruction(): Instruction? {
    return try {
        val words = this.split(" ")
        val dir = Direction.valueOf(words[0])
        val amount = words[1].toInt()

        Instruction(dir, amount)
    } catch (e: Exception) {
        null
    }
}