class Solution {
    public boolean isPalindrome(int number) {
        if(number<0) return false;
        else if(number<10) return true;
        else if(number%10==0) return false;
        else if(number<100&&number%11==0) return true;

        int revNum = 0, oriNum = number;
        while (number > 0) {
            revNum = revNum * 10 + number % 10;
            number = number / 10;
        }
        return revNum == oriNum;
    }
}
