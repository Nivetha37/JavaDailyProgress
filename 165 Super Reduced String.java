/*Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

Example.


aab shortens to b in one operation: remove the adjacent a characters.


Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

Function Description

Complete the superReducedString function in the editor below.

superReducedString has the following parameter(s):

string s: a string to reduce
Returns

string: the reduced string or Empty String*/


import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        String s = m.nextLine().trim();
        StringBuilder sb = new StringBuilder(s);
        int flag = 1;
        int n = sb.length();
        while(flag==1){
            flag =0;
            for(int i=0;i<n-1;i++){
            if(sb.charAt(i)==(sb.charAt(i+1))){
                sb.delete(i,i+2);
                flag = 1;
                n=sb.length();
            }
        }
        }
        String str = sb.toString();
        System.out.println(str.length()!=0?str:"Empty String");
        
        
        
    }
}
