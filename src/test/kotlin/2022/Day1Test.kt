import junit.framework.TestCase.assertEquals
import org.junit.Test
import utils.getResourceAsString

class Day1Test {

    companion object {
        private val INPUT by lazy {
            getResourceAsString("2022/day1.txt")
        }
    }

    @Test
    fun `part 1 samples`() {
        assertEquals(24000, Day1.part1("""
            1000
            2000
            3000
            
            4000
            
            5000
            6000
            
            7000
            8000
            9000
            
            10000
        """.trimIndent()))
    }

    @Test
    fun `part 1`() {
        assertEquals(69289, Day1.part1(INPUT))
    }

    @Test
    fun `part 2 samples`() {
        assertEquals(45000, Day1.part2(
            """
            1000
            2000
            3000
            
            4000
            
            5000
            6000
            
            7000
            8000
            9000
            
            10000
        """.trimIndent()))

    }

    @Test
    fun `part 2`() {
        assertEquals(205615, Day1.part2(INPUT))
    }
}
