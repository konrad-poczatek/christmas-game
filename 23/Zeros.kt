class Zeros {
    fun shiftZeroes(array: IntArray): IntArray {
        val zeroArray = mutableListOf<Int>()
        repeat(array.count { it == 0 }) {
            zeroArray += 0
        }
        return (array.filter { it != 0 } + zeroArray).toIntArray()
    }

    // Just for fun: lets do something unconventional!
    // Since we are a gambling company, we are going to shuffle it until we got what we want xD
    fun shiftZeroesRandom(array: IntArray): IntArray {
        val originalArray = array.copyOf().filter { it != 0 }.toIntArray()
        var fixed: Boolean

        do {
            array.shuffle()
            fixed = checkZeros(array) && checkOrder(array, originalArray)
            println("Current array: ${array.toList()} == $fixed (original: ${originalArray.toList()})")
        } while(!fixed)

        return array
    }

    private fun checkZeros(array: IntArray): Boolean {
        var gotZero = false
        array.forEach {
            if(!gotZero && it == 0) {
                gotZero = true
            } else if(gotZero && it != 0) {
                return false
            }
        }
        return true
    }

    private fun checkOrder(array: IntArray, originalArray: IntArray): Boolean {
        for(i in array.indices) {
            if(array[i] != 0 && array[i] != originalArray[i])
                return false
        }
        return true
    }
}
