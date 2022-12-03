import utils.splitBlankLines
import utils.splitNewlines
import utils.toIntList

object Day1 {
    fun part1(input: String): Int = input.splitBlankLines()
        .maxOf { it.splitNewlines().toIntList().sum() }

    fun part2(input: String): Int = input.splitBlankLines()
        .map { it.splitNewlines().toIntList().sum() }
        .sortedDescending().take(3).sum()
}
