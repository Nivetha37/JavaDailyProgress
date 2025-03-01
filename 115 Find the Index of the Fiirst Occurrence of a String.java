/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.*/
class Solution {
    public int strStr(String haystack, String needle) {
        int s1 = haystack.length(),s2=needle.length();

       if( s1 < s2) return -1;
       
        
        int startindex = -1;
        int i=0,j=0;
        
        while(i<=s1-s2 && j<s2){

            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                int count=1;
                for(int k=i+1;k<i+s2;k++){
                    if(haystack.charAt(k)==needle.charAt(j)) {
                        count++;
                        j++;
                    }
                    else {
                        j=0;
                        break;
                    }
                }
                if(count==s2) return i;
            }

            i++;
        }

        return startindex;
    }
}
