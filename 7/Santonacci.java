class Santonacci {
    public int fibonacci(int n) {
        if (n == 0) return 0;
        int totalsum = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < n; i++) {
            totalsum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = totalsum;
        }
        return totalsum;
    }
}
