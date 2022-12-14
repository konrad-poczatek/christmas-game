class SantaHouse {
    public int visit(int[] houses) {
        if (houses == null || houses.length == 0) {
            return 0;
        }
        if (houses.length == 1) {
            return houses[0];
        }
        int preMax = houses[0];
        int max = Integer.max(houses[0], houses[1]);

        for (int i = 2; i < houses.length; i++) {
            int current = Integer.max(houses[i], Integer.max(max, preMax + houses[i]));
            preMax = max;
            max = current;
        }

        return max;
    }
}
