class Solution0 {
    fun twoSum(gifts: IntArray, maxCost: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        gifts.forEachIndexed { index, i ->
            val goal = maxCost - i
            if (map[goal] != null) return intArrayOf(map[goal]!!, index)
            map[i] = index
        }
        return intArrayOf(-1, -1)
    }
}
