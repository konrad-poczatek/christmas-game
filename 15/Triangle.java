class Triangle {
    public List<List<Integer>> createGoodConstruction(int levels) {
        List<Integer> raw = new ArrayList<>();
        List<List<Integer>> raws = new ArrayList<>();
        int c = 1;
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                raw.add(c);
            }
            raws.add(raw);
            raw = new ArrayList<>();
        }
        return raws;
    }
}
