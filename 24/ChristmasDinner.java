class ChristmasDinner {
    public int findSingle(int[] numbers) {
        boolean hasNotPair = true;
        List<Integer> hasPairs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                return numbers[i];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    hasNotPair = false;
                    hasPairs.add(numbers[i]);
                    break;
                } else if (!hasPairs.contains(numbers[i])) {
                    hasNotPair = true;
                }
            }
            if (hasNotPair) {
                return numbers[i];
            }
        }
        return 0;
    }
}
