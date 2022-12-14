import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatePowerTest {
    private var calculatePower: CalculatePower = CalculatePower()

    @Test
    fun `test square root`() {
        assertEquals("expected", calculatePower.calculatePower("test", 0))
    }
}