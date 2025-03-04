/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.*/
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=s.length()-1;
        int count=0;
        while(i>=0 && s.charAt(i)!=' '  ){
            count++;
            i--;
        }
        return count;
    }
}
