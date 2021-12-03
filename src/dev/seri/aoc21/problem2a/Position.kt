package dev.seri.aoc21.problem2a

data class Position(
        val depth: Int,
        val horizontalPosition: Int,
        val aim: Int
) {
    fun move(instruction: Instruction) =
        when (instruction.direction) {
            Direction.forward -> this.copy(
                    horizontalPosition = horizontalPosition + instruction.amount,
                    depth = depth + (instruction.amount * aim)
            )
            Direction.down -> this.copy(aim = aim + instruction.amount)
            Direction.up -> this.copy(aim = aim - instruction.amount)
        }
}