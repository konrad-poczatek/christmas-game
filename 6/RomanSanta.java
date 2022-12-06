class RomanSanta {
    public String convertToRoman(int arabicNumber) {
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanDigits = new StringBuilder();
        for (int i = 0; i < roman.length; i++) {
            while (arabicNumber >= values[i]) {
                var intPart = arabicNumber / values[i];
                arabicNumber = arabicNumber % values[i];
                for (int j = 0; j < intPart; j++) {
                    romanDigits.append(roman[i]);
                }
            }
        }
        return romanDigits.toString();
    }


}
