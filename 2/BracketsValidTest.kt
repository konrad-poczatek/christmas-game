import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

class BracketsValidTest {
    private var bracketsValid: BracketsValid = BracketsValid()

    @Test
    fun `Test valid brackets`() {
        assertTrue(bracketsValid.areBracketsValid("[]"))
        assertTrue(bracketsValid.areBracketsValid("{[]}"))
        assertTrue(bracketsValid.areBracketsValid("({[]})"))
    }

    @Test
    fun `Test invalid brackets`() {
        assertFalse(bracketsValid.areBracketsValid("[]}"))
        assertFalse(bracketsValid.areBracketsValid("[{[]}}"))
    }
}