class Solution {
    public boolean isPalindrome(int number) {
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        return builder.toString().equals(builder.reverse().toString());
    }
}
