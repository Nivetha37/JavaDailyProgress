/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.*/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder word = new StringBuilder(s.replaceAll("[^a-z0-9]",""));
        
        return word.toString().equals(word.reverse().toString());
    }
}
