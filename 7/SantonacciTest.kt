import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SantonacciTest {
    private var santonacci: Santonacci = Santonacci()

    @Test
    fun `test fibonacci numbers`() {
        val fibonacciTestMap = mapOf(
            0 to 0,
            1 to 1,
            2 to 1,
            3 to 2,
            4 to 3,
            5 to 5,
            6 to 8,
            7 to 13,
            8 to 21,
            9 to 34,
            10 to 55,
            20 to 6765,
            30 to 832040
        )

        fibonacciTestMap.forEach {
            entry -> assertEquals(entry.value, santonacci.fibonacci(entry.key))
        }
    }
}