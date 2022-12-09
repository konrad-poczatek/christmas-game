class LongestSubstring {
    fun lengthOfLongestSubstring(str: String): Int {
        var currentSubstring = ""
        var substrings = ArrayList<String>()

//        var characterArray = str.toCharArray()
//        for(index1)

        // todo: fix this with right indexes
        str.toCharArray().forEach {
            str.toCharArray().forEach {
                if (!currentSubstring.contains(it)) {
                    currentSubstring += it
                } else {
                    substrings.add(currentSubstring)
                    currentSubstring = it.toString()
                }
            }
        }

        return substrings.maxBy{ it.length }.length
    }
}
