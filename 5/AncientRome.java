class AncientRome {
    public int convertToArabicNumber(String romanNumber) {
        char[] charArray = romanNumber.toUpperCase().toCharArray();
        int len = romanNumber.length();
        int i = 0;
        int result = 0;
        while (i < len) {
            int currentIntegerValue = getIntValue(charArray[i]);
            if (i + 1 < len && currentIntegerValue < getIntValue(charArray[i + 1])) {
                result = result - currentIntegerValue;
            } else {
                result = result + currentIntegerValue;
            }
            i++;
        }
        return result;
    }

    private int getIntValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
