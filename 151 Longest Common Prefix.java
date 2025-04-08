/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String str1 = strs[0],str2 = strs[strs.length-1];

        int min = Math.min(str1.length(),str2.length());
        int i=0;

        while(i<min && str1.charAt(i)==str2.charAt(i)){
            i++;
        }


        return str1.substring(0,i);
    }
}
