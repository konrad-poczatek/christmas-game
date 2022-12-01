class Solution {
    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int rem;
        int reverse = 0;
        while (number != 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }

       return original == reverse;
    }
}
