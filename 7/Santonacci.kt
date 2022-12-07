class Santonacci {
    fun fibonacci(n: Int): Int {
        return when(n) {
            0 -> 0
            1 -> 1
            else -> {
                var previousNumberA = 0 // We always start at 0
                var previousNumberB = 1 // But previous one should be at least 1
                var currentFibonacci = 0
                for(index in 2 .. n) {
                    // first sum them up
                    currentFibonacci = previousNumberA + previousNumberB
                    // then replace previousA with previousB
                    previousNumberA = previousNumberB
                    // and previousB becomes current sum
                    previousNumberB = currentFibonacci
                }
                return currentFibonacci
            }
        }
    }
}
