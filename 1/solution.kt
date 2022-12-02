class Solution {
    fun isPalindrome(number: Int): Boolean {
        val numberToCharList = number.toString().toList()
        val numberToListSize = numberToCharList.size

        return if (numberToListSize % 2 == 0) {
            val splitRight = numberToCharList.subList(0, numberToListSize / 2)
            val splitLeft = numberToCharList.subList(numberToListSize / 2, numberToListSize)

            splitRight == splitLeft.reversed()
        } else {
            val splitRight = numberToCharList.subList(0, numberToListSize / 2)
            val splitLeft = numberToCharList.subList(numberToListSize / 2 + 1, numberToListSize)

            splitRight == splitLeft.reversed() && numberToListSize != 1
        }
    }
}
