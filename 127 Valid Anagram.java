/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int arr[] = new int[26];

        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }

        for(char c:t.toCharArray()){
            if(arr[c-'a']-1<0) return false;
            arr[c-'a']--;

        }
        
        return true;

    }
}
