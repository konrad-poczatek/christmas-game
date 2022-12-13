class StairwaysToHeaven {
    public int climbStairs(int x) {
        int[] steps = new int[x + 1];
        steps[0] = 1;

        int combinations = steps[0] + steps[1];

        for (int i = 2; i <= x; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
            combinations += steps[i];
        }
        return combinations;
    }
}
