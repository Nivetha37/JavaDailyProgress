/*There is a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .

Example

There are  words in the string: 'one', 'Two', 'Three'.

Function Description

Complete the camelcase function in the editor below.

camelcase has the following parameter(s):

string s: the string to analyze
Returns
int: the number of words in */

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        String s = m.nextLine().trim();
        
        char ch[] = s.toCharArray();
        int count =1;
        for(int i=0;i<ch.length;i++){
            if(ch[i] <97) count++;
        }
        System.out.println(count);
;    } 
}
