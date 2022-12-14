class BracketsValid {
    fun areBracketsValid(input: String): Boolean {
        val startingBrackets = listOf('[', '{', '(')
        val brackets = mapOf('[' to ']', '{' to '}', '(' to ')')

        val nextExpectedBrackets = emptyList<Char>().toMutableList()

        input.forEach {char ->
            if(startingBrackets.contains(char)) {
                brackets[char]?.let { nextExpectedBrackets.add(it) }
            } else {
                if(nextExpectedBrackets.isNotEmpty() && char == nextExpectedBrackets?.last()) {
                    nextExpectedBrackets.removeLast()
                } else return false
            }

        }
        return true
    }
}