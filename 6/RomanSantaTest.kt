import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class TestRomanSanta {
    private var romanSanta: RomanSanta = RomanSanta()

    @Test
    fun `Test simple number conversions`() {
        assertEquals("I", romanSanta.convertToRoman(1))
        assertEquals("V", romanSanta.convertToRoman(5))
        assertEquals("X", romanSanta.convertToRoman(10))
        assertEquals("L", romanSanta.convertToRoman(50))
        assertEquals("C", romanSanta.convertToRoman(100))
        assertEquals("D", romanSanta.convertToRoman(500))
        assertEquals("M", romanSanta.convertToRoman(1000))
    }

    @Test
    fun `Test advanced number conversions`() {
        assertEquals("XI", romanSanta.convertToRoman(11))
        assertEquals("LV", romanSanta.convertToRoman(55))
        assertEquals("CCCLXXVIII", romanSanta.convertToRoman(378))
        assertEquals("MCCCXXXVII", romanSanta.convertToRoman(1337))
    }

    @Test
    fun `Test complex number conversions`() {
        assertEquals("IV", romanSanta.convertToRoman(4))
        assertEquals("XLIX", romanSanta.convertToRoman(49))
        assertEquals("CMXCIV", romanSanta.convertToRoman(994))
        assertEquals("MCCXXXIV", romanSanta.convertToRoman(1234))
    }
}