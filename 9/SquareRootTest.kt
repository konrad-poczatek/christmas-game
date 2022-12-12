import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SquareRootTest {
    private var squareRoot: SquareRoot = SquareRoot()

    @Test
    fun `test square root`() {
        val squareRootTestMap = mapOf(
            4 to 2,
            9 to 3,
            Integer.MAX_VALUE to 46340
        )

        squareRootTestMap.forEach {
            entry -> assertEquals(entry.value, squareRoot.findSquareRoot(entry.key))
        }
    }
}