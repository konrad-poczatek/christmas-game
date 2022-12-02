class Program {
  fun areBracketsValid(brackets: String): Boolean {
      val check = brackets.map {
          when (it) {
              '[' -> brackets.contains("]")
              '{' -> brackets.contains("}")
              '(' -> brackets.contains(")")
              else -> true
          }
      }

      return !check.contains(false)
  }
}
