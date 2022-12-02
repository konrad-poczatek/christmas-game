class Program {
    fun areBracketsValid(brackets: String): Boolean {
        val check = when (brackets.first()) {
            '[' -> brackets.split("[", "]")
            '{' -> brackets.split("{", "}")
            '(' -> brackets.split("(", ")")
            else -> listOf("false", "false", "false")
        }

        return if (check.last().isEmpty() && check[1].isNotEmpty()) {
            areBracketsValid(check[1])
        } else if (check[1].isEmpty() && check.last().isNotEmpty()) {
            areBracketsValid(check.last())
        } else if (check[1].isEmpty() && check.last().isEmpty()) {
            true
        } else {
            false
        }
    }
}
