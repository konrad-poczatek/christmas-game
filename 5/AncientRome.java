class AncientRome {
    public int convertToArabicNumber(String romanNumber) {
        Map<String, Integer> romanNumbersValue = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000 );
        String[] split = romanNumber.split("");
        List<Integer> counts = new ArrayList<>();

        for(int i=split.length-1; i>=0; i--) {
            if(counts.size() > 0 && counts.get(counts.size()-1) > romanNumbersValue.get(split[i])) {
                counts.add(-romanNumbersValue.get(split[i]));
            } else {
                counts.add(romanNumbersValue.get(split[i]));
            }
        }

        return counts.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
