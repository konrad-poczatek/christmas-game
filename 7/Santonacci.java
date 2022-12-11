class Santonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        int sum = fib[0] + fib[1];

        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            sum += fib[i];
        }
        return sum;
    }
}
