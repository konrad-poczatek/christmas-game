enum class RomanNumber(val arabicNumber: Int) {
    I(1), // 1
    V(5), // 5
    X(10), // 10
    L(50), // 50
    C(100), // 100
    D(500), // 500
    M(1000), // 1000
}

class RomanSanta {
    fun convertToRoman(arabicNumber: Int): String {
        var numberRemaining = arabicNumber
        var romanOutput = ""
        while(numberRemaining != 0) {
            val biggestRomanNumber = getBiggestRomanNumber(numberRemaining)
            romanOutput += biggestRomanNumber.name
            numberRemaining -= biggestRomanNumber.arabicNumber
        }

        return dirtyFixUglyNumbers(romanOutput)
    }

    private fun getBiggestRomanNumber(arabicNumber: Int): RomanNumber {
        RomanNumber.values().reversed().forEach {
            if(arabicNumber >= it.arabicNumber) return it
        }
        return RomanNumber.I
    }

    // todo: this can probably be done way better :see-no-evil:
    private fun dirtyFixUglyNumbers(romanNumber: String): String {
        return romanNumber
            // 4 and 9
            .replace("VIIII", "IX")
            .replace("IIII", "IV")
            // 40 and 90
            .replace("LXXXX", "XC")
            .replace("XXXX", "XL")

            // 400 and 900
            .replace("DCCCC", "CM")
            .replace("CCCC", "CD")
    }
}
