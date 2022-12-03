class Solution {

    fun twoSum(gifts: IntArray, maxCost: Int): IntArray {
        val alreadyVisitedNumbers = mutableMapOf<Int, Int>()
        for ((position, gift) in gifts.withIndex()) {
            val remaining = maxCost - gift
            if (alreadyVisitedNumbers.containsKey(remaining)) {
                val firstItemIndex = alreadyVisitedNumbers.get(remaining)!!
                return intArrayOf(firstItemIndex, position)
            }

            alreadyVisitedNumbers.put(gift, position)
        }

        return IntArray(2)
    }

}
