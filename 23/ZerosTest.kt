import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ZerosTest {
    private var zeros: Zeros = Zeros()

    @Test
    fun `test zeros shift`() {
        val zerosShift = mapOf(
            intArrayOf(0) to intArrayOf(0),
            intArrayOf(1) to intArrayOf(1),
            intArrayOf(0,1) to intArrayOf(1,0),
            intArrayOf(1,0) to intArrayOf(1,0),
            intArrayOf(1,0,1,0,2,3,4,0,5) to intArrayOf(1,1,2,3,4,5,0,0,0),
            intArrayOf(1,0,3,0,1,2,4) to intArrayOf(1,3,1,2,4,0,0),
            intArrayOf(0,0,0,0,0,123456) to intArrayOf(123456,0,0,0,0,0),
        )

        zerosShift.forEach {
            entry -> assertEquals(entry.value.toList(), zeros.shiftZeroes(entry.key).toList())
        }
    }
}