package dev.seri.aoc21.problem2b

data class Position(
        val depth: Int,
        val horizontalPosition: Int
) {
    fun move(instruction: Instruction) =
        when (instruction.direction) {
            Direction.forward -> this.copy(horizontalPosition = horizontalPosition + instruction.amount)
            Direction.down -> this.copy(depth = depth + instruction.amount)
            Direction.up -> this.copy(depth = depth - instruction.amount)
        }
}