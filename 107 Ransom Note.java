/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int []arr = new int[26];

  
        for(char i:ransomNote.toCharArray()){
            int index = magazine.indexOf(i,arr[i-'a']);

            if(index==-1) return false;

            arr[i-'a'] = index+1;
        }

        
        return true;

        
    }
}
