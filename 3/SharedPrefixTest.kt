import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

class SharedPrefixTest {
    private var sharedPrefix: SharedPrefix = SharedPrefix()

    @Test
    fun `Test shared prefix`() {
        assertEquals("mo", sharedPrefix.biggestSharedPrefix(arrayOf("money", "mountain bike", "morning breakfast")))
        assertEquals("", sharedPrefix.biggestSharedPrefix(arrayOf("money", "bike", "breakfast")))
    }
}