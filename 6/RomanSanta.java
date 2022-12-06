class RomanSanta {
    public String convertToRoman(int arabicNumber) {
        List<Integer> numbers = List.of(1000, 500, 100, 50, 10, 5, 1);
        List<Integer> allowedSubstractions = List.of(100, 10, 1);
        List<String> letter = List.of("M", "D", "C", "L", "X", "V", "I");

        StringBuilder stringBuilder = new StringBuilder();

        int processedNumber = arabicNumber;

        for(int n : numbers) {
            boolean usedSubstraction = false;
            if(n != 1) {
                int lowerNumber = allowedSubstractions.get(numbers.indexOf(n) / 2);
                if (processedNumber < n && (processedNumber) >= (n - lowerNumber)) {
                    usedSubstraction = true;
                    processedNumber -= (n - lowerNumber);
                    stringBuilder.append(letter.get(numbers.indexOf(lowerNumber)));
                    stringBuilder.append(letter.get(numbers.indexOf(n)));
                }
            }
            if(!usedSubstraction) {
                if (processedNumber % n < processedNumber) {
                    stringBuilder.append(String.join("", Collections.nCopies(processedNumber / n, letter.get(numbers.indexOf(n)))));
                    processedNumber = processedNumber % n;
                }
            }
            if(n != 1) {
                int lowerNumber = allowedSubstractions.get(numbers.indexOf(n) / 2);
                if (processedNumber < n && (processedNumber) >= (n - lowerNumber)) {
                    processedNumber -= (n - lowerNumber);
                    stringBuilder.append(letter.get(numbers.indexOf(lowerNumber)));
                    stringBuilder.append(letter.get(numbers.indexOf(n)));
                }
            }
        }


        return stringBuilder.toString();
    }
}
