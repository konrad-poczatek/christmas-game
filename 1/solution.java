class Solution {
    public boolean isPalindrome(int number) {
        if(number == 0) return true;
        else if(number < 0) return false;
        else return checknumber(number);
    }

    static boolean checknumber(int number){
        String numberString = String.valueOf(number);
        StringBuilder numberStringBackWards = new StringBuilder(numberString).reverse();
        return numberString.equals(numberStringBackWards.toString());
    }
}
