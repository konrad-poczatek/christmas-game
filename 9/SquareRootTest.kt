import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SquareRootTest {
    private var longestSubstring: LongestSubstring = LongestSubstring()

    @Test
    fun `test longest substring`() {
        val longestSubstringTestMap = mapOf(
            "qweqrtw" to 5,
            "aaaaaa" to 1,
            "pffew" to 3
        )

        longestSubstringTestMap.forEach {
            entry -> assertEquals(entry.value, longestSubstring.lengthOfLongestSubstring(entry.key))
        }
    }
}