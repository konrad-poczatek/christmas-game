import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

class PalindromeTest {
    private var palindrome: Palindrome = Palindrome()

    @Test
    fun `test palindrome numbers`() {
        assertTrue(palindrome.isPalindrome(12321))
        assertTrue(palindrome.isPalindrome(991151199))
    }

    @Test
    fun `test non-palindrome numbers`() {
        assertFalse(palindrome.isPalindrome(10))
        assertFalse(palindrome.isPalindrome(123))
    }
}