class Palindrome {
    fun isPalindrome(number: Int): Boolean {
        return number.toString().reversed() == number.toString()
    }
}