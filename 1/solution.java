class solution {
    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        } else if (number < 10){
            return true;
        } else {
            int lengthMinusOne = (int)Math.floor(Math.log10(number));
            return areEndDigitsSame(number, lengthMinusOne);
        }
    }

    private boolean areEndDigitsSame(int number, int lengthMinusOne) {
        int firstDigit = number/(int)Math.pow(10, lengthMinusOne);
        int lastDigit = number%10;
        if(firstDigit != lastDigit) {
            return false;
        } else {
            if (lengthMinusOne > 2) {
                int nextNumber = ((int)(number - firstDigit * Math.pow(10, lengthMinusOne)))/10;
                areEndDigitsSame(nextNumber, lengthMinusOne -2);
            }

        }
        return true;
    }
}
